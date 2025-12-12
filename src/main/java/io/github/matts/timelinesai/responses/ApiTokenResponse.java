package io.github.matts.timelinesai.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiTokenResponse {
    private String workspace_id;
    private String token;
    private String rotated_at;
}
