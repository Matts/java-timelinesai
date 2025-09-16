package io.github.matts.timelinesai.api.v1;

import feign.HeaderMap;
import feign.RequestLine;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.responses.WhatsappAccountResponse;

import java.util.Map;

public interface TLAccountsApi extends TimelinesAiApi {
    @RequestLine("GET /integrations/api/whatsapp_accounts")
    WhatsappAccountResponse listAccounts(@HeaderMap Map<String, String> headers);
}
