package io.github.matts.emailengine.api.v1;

import feign.Body;
import feign.Headers;
import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.model.request.RequestAuthForm;
import io.github.matts.emailengine.model.response.RequestAuthFormResponse;

public interface AuthenticationApi extends EmailEngineApi {
    @RequestLine("POST /v1/authentication/form")
    RequestAuthFormResponse generateAuthenticationLink(RequestAuthForm requestAuthForm);
}
