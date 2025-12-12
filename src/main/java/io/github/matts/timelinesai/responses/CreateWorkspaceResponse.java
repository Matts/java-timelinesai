package io.github.matts.timelinesai.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateWorkspaceResponse {
    private String workspace_id;
    private String display_name;
    private int plan_id;
    private int seats_total;
    private int seats_available;
    private int owner_user_id;
    private String created_at;
}
