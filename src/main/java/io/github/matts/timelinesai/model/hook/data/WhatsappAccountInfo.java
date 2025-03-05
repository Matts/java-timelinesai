package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhatsappAccountInfo {
    private String full_name;
    private String email;
    private String phone;
}
