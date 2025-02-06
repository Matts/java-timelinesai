package org.example;

import io.github.matts.emailengine.api.v1.SettingsApi;
import io.github.matts.emailengine.client.EmailEngineClient;
import io.github.matts.emailengine.model.DiscoveredEmailSettings;

public class Main {
    public static void main(String[] args) {
        SettingsApi settings = new EmailEngineClient().builder("", "")
                .createApi(SettingsApi.class);

        DiscoveredEmailSettings autodiscover = settings.autoconfig("");
        System.out.println(autodiscover);
    }
}