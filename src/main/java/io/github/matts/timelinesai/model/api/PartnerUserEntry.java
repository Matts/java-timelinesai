package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerUserEntry {
    private Long user_id;
    private String display_name;
    private String role;
    private String email;
    private String status;
    private String created_at;

}
