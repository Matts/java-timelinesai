package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerWhatsappAccountEntry {
    private Long user_id;
    private Boolean connected;
    private Long whatsapp_account_id;
    private String phone_number_e164;
    private String connection_status;
    private String connected_at;
}
