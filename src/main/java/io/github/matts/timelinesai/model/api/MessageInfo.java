package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageInfo {
    private String uid;
    private String chat_id;
    private String timestamp;
    private String sender_phone;
    private String sender_name;
    private String recipient_phone;
    private String recipient_name;
    private Boolean from_me;
    private String text;
    private String attachment_url;
    private String attachment_filename;
    private String status;
    private String origin;
    private Boolean has_attachment;
    private String message_type;
    private HashMap<String, String> reactions;
    private HashMap<String, String> data;
    private String created_by;
}
