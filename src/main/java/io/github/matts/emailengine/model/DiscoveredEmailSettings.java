package io.github.matts.emailengine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscoveredEmailSettings {
    private ResolvedServerSettings imap;
    private ResolvedServerSettings smtp;
    private String _source;
    private EmailSettingsAppPassword appPassword;
}
