package io.github.matts.emailengine.api.v1;

import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.model.response.AccountFilterResponse;

public interface AccountsApi extends EmailEngineApi {
    @RequestLine("GET /v1/accounts")
    AccountFilterResponse listAccounts();
}
