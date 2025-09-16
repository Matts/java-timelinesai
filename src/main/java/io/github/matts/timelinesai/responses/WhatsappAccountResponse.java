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
public class WhatsappAccountResponse extends Response {
    private WhatsappAccountResponseData data;

    public WhatsappAccountResponse(String status, WhatsappAccountResponseData data) {
        super(status);
        this.data = data;
    }
}

