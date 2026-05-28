package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallDataInfo {
    private Integer duration;
    private CallDirection direction;
    private boolean is_video;
    private String status;
    private String timestamp;
    private String message_uid;
    private PartyInfo caller;
    private PartyInfo recipient;
}
