package io.github.matts.emailengine.client;

import feign.*;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import io.github.matts.emailengine.api.EmailEngineApi;

import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class EmailEngineClient {

    public MailgunClientBuilder builder(String baseUrl, String apiKey) {
        return new MailgunClientBuilder(baseUrl, apiKey);
    }

    public static class MailgunClientBuilder {
        private Retryer retryer = new Retryer.Default();
        private ErrorDecoder errorDecoder = new ErrorDecoder.Default();
        private Request.Options options = new Request.Options();
        private AsyncClient<Object> client = new AsyncClient.Default<>(
                new Client.Default(null, null),
                Executors.newSingleThreadExecutor()
        );
        private final String baseUrl;
        private final String apiKey;

        private MailgunClientBuilder(String baseUrl, String apiKey) {
            this.baseUrl = baseUrl;
            this.apiKey = apiKey;
        }

        public static EmailEngineClient build() {
            return new EmailEngineClient();
        }

        public <T extends EmailEngineApi> T createApi(Class<T> apiType) {
            return getFeignBuilder().target(apiType, baseUrl);
        }

        public <T extends EmailEngineApi> T createApiWithRequestInterceptor(Class<T> apiType, RequestInterceptor requestInterceptor) {
            return getFeignBuilder().requestInterceptor(requestInterceptor).target(apiType, baseUrl);
        }

        private Feign.Builder getFeignBuilder() {
            return Feign.builder()
                    .retryer(retryer)
                    .encoder(new JacksonEncoder())
                    .decoder(new JacksonDecoder())
                    .errorDecoder(errorDecoder)
                    .options(options)
                    .requestInterceptor(new EmailEngineAuthInterceptor());
        }

        public class EmailEngineAuthInterceptor implements RequestInterceptor {
            @Override
            public void apply(RequestTemplate template) {
                template.headerLiteral("Authorization", "Bearer " + apiKey);
                template.headerLiteral("Accept", "application/json");
                template.headerLiteral("Content-Type", "application/json");
                template.headerLiteral("x-ee-timeout", "30000");
            }
        }
    }
}
