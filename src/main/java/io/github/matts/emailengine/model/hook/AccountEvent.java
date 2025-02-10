package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.data.AccountEventData;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AccountEvent extends Event {
    private AccountEventData data;

    @Builder
    public AccountEvent(String serviceUrl, String account, String date, Events event, AccountEventData data) {
        super(serviceUrl, account, date, event);
        this.data = data;
    }
}
