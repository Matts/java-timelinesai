package io.github.matts.timelinesai.api.v1;

import feign.HeaderMap;
import feign.RequestLine;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.responses.WhatsappAccountResponse;

import java.util.Map;

public interface AccountsApi extends TimelinesAiApi {
    @RequestLine("GET /integrations/api/whatsapp_accounts")
    Object listAccounts(@HeaderMap Map<String, String> headers);
}
