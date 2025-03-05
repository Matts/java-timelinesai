package io.github.matts.timelinesai.model.hook;

import io.github.matts.timelinesai.model.hook.data.AccountDataInfo;
import io.github.matts.timelinesai.model.hook.impl.Event;
import io.github.matts.timelinesai.model.hook.impl.EventType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class AccountDataEvent extends Event {
    private AccountDataInfo whatsapp_account;

    @Builder
    public AccountDataEvent(EventType event_type, AccountDataInfo whatsapp_account) {
        this.whatsapp_account = whatsapp_account;
    }
}
