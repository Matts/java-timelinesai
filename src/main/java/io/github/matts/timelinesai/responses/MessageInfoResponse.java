package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.MessageInfo;
import io.github.matts.timelinesai.model.api.MessageListData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MessageInfoResponse  extends Response {
    private MessageInfo data;

    public MessageInfoResponse(String status, MessageInfo data) {
        super(status);
        this.data = data;
    }
}
