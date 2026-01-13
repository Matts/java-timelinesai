package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.PartnerUserEntry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponse {
    private String workspace_id;
    private int seats_total;
    private int seats_available;
    private List<PartnerUserEntry> users;
}
