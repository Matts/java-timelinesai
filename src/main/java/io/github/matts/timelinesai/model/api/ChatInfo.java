package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatInfo {
    private Integer id;
    private String name;
    private String phone;
    private String jid;
    private Boolean is_group;
    private Boolean closed;
    private Boolean read;
    private List<String> labels;
    private Boolean chatgpt_autoresponse_enabled;
    private String responsible_email;
    private String responsible_name;
    private String whatsapp_account_id;
    private String chat_url;
    private String created_timestamp;
    private String last_message_uid;
    private String last_message_timestamp;
    private Boolean unattended;
    private String photo;

    public String messageTimestamp() {
        if(last_message_timestamp == null) {
            return created_timestamp;
        }

        return last_message_timestamp;
    }
}
