package io.github.matts.timelinesai.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QrCodeResponse {
    private String workspace_id;
    private Long user_id;
    private String qr_link;
    private String expires_at;
    private Boolean whatsapp_disconnected;
    private Boolean previous_qr_revoked;
}
