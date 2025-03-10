package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.ChatListData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ChatListResponse extends Response {
    private ChatListData data;

    public ChatListResponse(String status, ChatListData data) {
        super(status);
        this.data = data;
    }
}
