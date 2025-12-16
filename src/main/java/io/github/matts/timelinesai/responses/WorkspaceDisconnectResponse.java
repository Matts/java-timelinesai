package io.github.matts.timelinesai.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkspaceDisconnectResponse {
    private String workspace_id;
    private Integer user_id;
    private Boolean disconnected;
    private Integer whatsapp_account_id;
    private String phone_number;
    private String description;
}
