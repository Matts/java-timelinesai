package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.ChatListData;
import io.github.matts.timelinesai.model.api.MessageListData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MessageListResponse extends Response {
    private MessageListData data;

    public MessageListResponse(String status, MessageListData data) {
        super(status);
        this.data = data;
    }
}
