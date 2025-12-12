package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.PartnerUserEntry;
import io.github.matts.timelinesai.model.api.PartnerWhatsappAccountEntry;
import io.github.matts.timelinesai.model.api.SeatInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class GetWorkspaceResponse {
    private String workspace_id;
    private String display_name;
    private SeatInfo seats;
    private List<PartnerWhatsappAccountEntry> whatsapp_accounts;
    private List<PartnerUserEntry> users;
}
