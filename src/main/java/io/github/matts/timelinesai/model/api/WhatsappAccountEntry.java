package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WhatsappAccountEntry {
    private String id;
    private String phone;
    private String connected_on;
    private String status;
    private String owner_name;
    private String owner_email;
    private String account_name;
    private Boolean is_visible;
}
