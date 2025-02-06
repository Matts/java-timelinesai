package io.github.matts.emailengine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResolvedServerSettings {
    private DetectedAuthenticationInfo auth;
    private String host;
    private String port;
    private boolean secure;
}
