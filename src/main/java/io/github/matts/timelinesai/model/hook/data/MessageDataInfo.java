package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDataInfo {
    private String text;
    private MessageDirection direction;
    private String origin;
    private String timestamp;
    private String message_uid;
    private String reply_to_uid;
    private PartyInfo sender;
    private PartyInfo recipient;
    private List<AttachmentInfo> attachments;
}
