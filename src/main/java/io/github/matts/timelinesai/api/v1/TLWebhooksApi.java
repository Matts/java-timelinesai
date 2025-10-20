package io.github.matts.timelinesai.api.v1;

import feign.HeaderMap;
import feign.Param;
import feign.RequestLine;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.model.api.WebhookInfo;
import io.github.matts.timelinesai.model.api.WebhookListResponse;
import io.github.matts.timelinesai.model.api.WebhookResponse;

import java.util.Map;

public interface TLWebhooksApi extends TimelinesAiApi {
    @RequestLine("GET /integrations/api/webhooks")
    WebhookListResponse listWebhooks(@HeaderMap Map<String, String> headers);

    @RequestLine("POST /integrations/api/webhooks")
    WebhookResponse createWebhook(@HeaderMap Map<String, String> headers, WebhookInfo body);

    @RequestLine("GET /integrations/api/webhooks/{webhookId}")
    WebhookResponse getWebhook(@HeaderMap Map<String, String> headers, @Param("webhookId") String webhookId);

    @RequestLine("PUT /integrations/api/webhooks/{webhookId}")
    WebhookResponse updateWebhook(@HeaderMap Map<String, String> headers, @Param("webhookId") String webhookId, WebhookInfo body);

    @RequestLine("DELETE /integrations/api/webhooks/{webhookId}")
    Object deleteWebhookInternal(@HeaderMap Map<String, String> headers, @Param("webhookId") String webhookId);

    default Boolean deleteWebhook(Map<String, String> headers, String webhookId) {
        try {
            deleteWebhookInternal(headers, webhookId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

