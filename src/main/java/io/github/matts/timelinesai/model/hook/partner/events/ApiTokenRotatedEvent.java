package io.github.matts.timelinesai.model.hook.partner.events;

import io.github.matts.timelinesai.model.hook.partner.PartnerEvent;
import io.github.matts.timelinesai.model.hook.partner.PartnerEvents;
import lombok.*;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class ApiTokenRotatedEvent extends PartnerEvent {
    private Instant rotated_at;

    @Builder
    public ApiTokenRotatedEvent(String workspace_id, PartnerEvents event_type, String partner_id, Instant triggered_at, Instant rotated_at) {
        super(workspace_id, event_type, partner_id, triggered_at);
        this.rotated_at = rotated_at;
    }
}
