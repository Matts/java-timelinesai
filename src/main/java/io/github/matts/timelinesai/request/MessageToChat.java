package io.github.matts.timelinesai.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MessageToChat {
    private String chat_name;
    private String label;
    private String text;
    private String file_uid;
    private String attachment_template_id;
    private String reply_to;
}
