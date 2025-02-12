package io.github.matts.emailengine.model.request;

import io.github.matts.emailengine.model.AddressEntry;
import io.github.matts.emailengine.model.MessageReference;
import io.github.matts.emailengine.model.UploadAttachment;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class MessageUpload {
    private String path;
    private List<String> flags;
    private String internalDate;
    private MessageReference reference;
    private String raw;
    private AddressEntry from;
    private List<AddressEntry> to;
    private List<AddressEntry> cc;
    private List<AddressEntry> bcc;
    private String subject;
    private String text;
    private String html;
    private List<UploadAttachment> attachments;
    private String messageId;
    private String locale;
    private String tz;
}
