package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatDataInfo {
    private Integer id;
    private String name;
    private String phone;
    private String jid;
    private Boolean is_group;
    private Boolean closed;
    private Boolean read;
    private List<String> labels;
    private Boolean unattended_customer;
    private Boolean chatgpt_autoresponse_enabled;
    private String whatsapp_account_id;
    private String chat_url;
    private Date created_timestamp;
    private String last_message_uuid;
    private Date last_message_timestamp;
    private String responsible_name;
    private String responsible_email;
    private String previous_responsible_name;
    private String previous_responsible_email;
}
