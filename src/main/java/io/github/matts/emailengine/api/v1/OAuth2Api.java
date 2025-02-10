package io.github.matts.emailengine.api.v1;

import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.model.response.AccountFilterResponse;
import io.github.matts.emailengine.model.response.OAuth2FilterResponse;

public interface OAuth2Api extends EmailEngineApi {
    @RequestLine("GET /v1/oauth2")
    OAuth2FilterResponse listApplications();
}
