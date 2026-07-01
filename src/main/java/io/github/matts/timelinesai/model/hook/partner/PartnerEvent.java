package io.github.matts.timelinesai.model.hook.partner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PartnerEvent {
    private String workspace_id;
    // event_type deserializes via PartnerEvents' @JsonCreator (Jackson 2 & 3 compatible).
    private PartnerEvents event_type;
    private String partner_id;
    private Instant triggered_at;
}
