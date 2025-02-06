package io.github.matts.emailengine.model.response;

import io.github.matts.emailengine.model.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseItem {
    private String account;
    private String name;
    private String email;
    private AccountType type;
    private String app;
    private String state;
    private String webhooks;
    private String proxy;
    private String smtpEhloName;
    private String syncTime;
    private AccountErrorEntry lastError;
}
