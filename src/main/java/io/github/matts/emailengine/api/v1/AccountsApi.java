package io.github.matts.emailengine.api.v1;

import feign.Param;
import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.model.response.AccountFilterResponse;
import io.github.matts.emailengine.model.response.DeleteRequestResponse;

public interface AccountsApi extends EmailEngineApi {
    @RequestLine("GET /v1/accounts")
    AccountFilterResponse listAccounts();

    @RequestLine("DELETE /v1/account/{accountId}")
    DeleteRequestResponse deleteAccount(@Param("accountId") String accountId);
}
