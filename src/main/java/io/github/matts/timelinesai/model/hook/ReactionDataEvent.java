package io.github.matts.timelinesai.model.hook;

import io.github.matts.timelinesai.model.hook.data.MessageChatDataInfo;
import io.github.matts.timelinesai.model.hook.data.MessageDataInfo;
import io.github.matts.timelinesai.model.hook.data.ReactionDataInfo;
import io.github.matts.timelinesai.model.hook.data.WhatsappAccountInfo;
import io.github.matts.timelinesai.model.hook.impl.Event;
import io.github.matts.timelinesai.model.hook.impl.EventType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class ReactionDataEvent extends Event {
    private MessageChatDataInfo chat;
    private WhatsappAccountInfo whatsapp_account;
    private ReactionDataInfo reaction;

    @Builder
    public ReactionDataEvent(EventType event_type, WhatsappAccountInfo whatsapp_account, MessageChatDataInfo chat, ReactionDataInfo reaction) {
        super(event_type);
        this.chat = chat;
        this.whatsapp_account = whatsapp_account;
        this.reaction = reaction;
    }
}
