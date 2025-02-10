package io.github.matts.emailengine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MessageEntry {
    private String id;
    private String uid;
    private String emailId;
    private String threadId;
    private String date;
    private boolean draft;
    private boolean unseen;
    private boolean flagged;
    private int size;
    private String subject;
    private AddressEntry from;
    private List<AddressEntry> replyTo;
    private List<AddressEntry> to;
    private List<AddressEntry> cc;
    private List<AddressEntry> bcc;
    private String messageId;
    private String inReplyTo;
    private List<String> flags;
    private List<String> labels;
    private List<AttachmentEntry> attachments;
    private TextInfo text;
    private String preview;
}
