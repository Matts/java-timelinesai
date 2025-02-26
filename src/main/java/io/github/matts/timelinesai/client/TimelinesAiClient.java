package io.github.matts.timelinesai.client;

import feign.*;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import io.github.matts.timelinesai.api.TimelinesAiApi;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executors;

public class TimelinesAiClient {

    public TimelinesAiClientBuilder builder(String baseUrl, String apiKey) {
        return new TimelinesAiClientBuilder(baseUrl, apiKey);
    }

    public static class TimelinesAiClientBuilder {
        private Retryer retryer = new Retryer.Default();
        private ErrorDecoder errorDecoder = new ErrorDecoder.Default();
        private Request.Options options = new Request.Options();
        private AsyncClient<Object> client = new AsyncClient.Default<>(
                new Client.Default(null, null),
                Executors.newSingleThreadExecutor()
        );
        private final String baseUrl;
        private final String apiKey;

        private TimelinesAiClientBuilder(String baseUrl, String apiKey) {
            this.baseUrl = baseUrl;
            this.apiKey = apiKey;
        }

        public static TimelinesAiClient build() {
            return new TimelinesAiClient();
        }

        public <T extends TimelinesAiApi> T createApi(Class<T> apiType) {
            return getFeignBuilder().target(apiType, baseUrl);
        }

        public <T extends TimelinesAiApi> T createApiWithRequestInterceptor(Class<T> apiType, RequestInterceptor requestInterceptor) {
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
            private static final String API_KEY_PARAM = "apiKey";

            @Override
            public void apply(RequestTemplate template) {
                Map<String, Collection<String>> queries = template.queries();
//                if (queries.containsKey(API_KEY_PARAM)) {
//                    Collection<String> values = queries.get(API_KEY_PARAM);
//                    if (values != null && !values.isEmpty()) {
//                        String apiKey = values.iterator().next(); // Get first value
//                        template.headerLiteral("Authorization", "Bearer " + apiKey);
//                        template.query(API_KEY_PARAM, (String) null); // Remove from query params
//                    }
//                } else {
//                    template.headerLiteral("Authorization", "Bearer " + apiKey);
//                }

                template.headerLiteral("Accept", "application/json");
                template.headerLiteral("Content-Type", "application/json");
            }
        }
    }
}
