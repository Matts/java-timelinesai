package io.github.matts.timelinesai.model.hook;

import io.github.matts.timelinesai.model.hook.data.*;
import io.github.matts.timelinesai.model.hook.impl.Event;
import io.github.matts.timelinesai.model.hook.impl.EventType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class CallDataEvent extends Event {
    private MessageChatDataInfo chat;
    private WhatsappAccountInfo whatsapp_account;
    private CallDataInfo call_details;

    @Builder
    public CallDataEvent(EventType event_type, WhatsappAccountInfo whatsapp_account, MessageChatDataInfo chat, CallDataInfo call_details) {
        super(event_type);
        this.chat = chat;
        this.whatsapp_account = whatsapp_account;
        this.call_details = call_details;
    }
}
