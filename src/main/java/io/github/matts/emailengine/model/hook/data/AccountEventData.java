package io.github.matts.emailengine.model.hook.data;

import lombok.Data;

@Data
public class AccountEventData {
    private Boolean initialized;
    private String account;
}
