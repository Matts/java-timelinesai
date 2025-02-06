package io.github.matts.emailengine.api.v1;

import feign.Param;
import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.model.DiscoveredEmailSettings;

public interface SettingsApi extends EmailEngineApi {
    @RequestLine("GET /v1/autoconfig?email={email}")
    DiscoveredEmailSettings autoconfig(@Param("email") String email);

}
