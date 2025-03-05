package io.github.matts.timelinesai.model.hook;

import io.github.matts.timelinesai.model.hook.data.AccountDataInfo;
import io.github.matts.timelinesai.model.hook.data.ChatDataInfo;
import io.github.matts.timelinesai.model.hook.impl.Event;
import io.github.matts.timelinesai.model.hook.impl.EventType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class ChatDataEvent extends Event {
    private ChatDataInfo chat;
    private AccountDataInfo whatsapp_account;

    @Builder
    public ChatDataEvent(EventType event_type, AccountDataInfo whatsapp_account, ChatDataInfo chat) {
        super(event_type);
        this.chat = chat;
        this.whatsapp_account = whatsapp_account;
    }
}
