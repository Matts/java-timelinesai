package io.github.matts.timelinesai.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MessageToPhone {
    private String phone;
    private String text;
    private String file_uid;
}
