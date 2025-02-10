package io.github.matts.emailengine.model;

import io.github.matts.emailengine.model.response.AccountErrorEntry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OAuth2Entry {
    private String id;
    private String name;
    private String description;
    private String title;
    private AccountType provider;
    private boolean enabled;
    private boolean legacy;
    private String updated;
    private boolean includeInListing;
    private String clientId;
    private String clientSecret;
    private String authority;
    private String redirectUrl;
    private String serviceClient;
    private String googleProjectId;
    private String googleWorkspaceAccounts;
    private String serviceClientEmail;
    private String serviceKey;
    private AccountErrorEntry lastError;

}
