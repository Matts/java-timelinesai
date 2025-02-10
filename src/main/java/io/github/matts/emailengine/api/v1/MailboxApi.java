package io.github.matts.emailengine.api.v1;

import feign.Param;
import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.model.response.MailboxFilterResponse;

public interface MailboxApi extends EmailEngineApi {
    @RequestLine("GET /v1/account/{accountId}/mailboxes")
    MailboxFilterResponse listMailboxes(@Param("accountId") String accountId);
}
