package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageChatDataInfo {
    private String full_name;
    private String chat_url;
    private Integer chat_id;
    private Boolean is_group;
    private String phone;
    private String responsible_name;
    private String responsible_email;
}
