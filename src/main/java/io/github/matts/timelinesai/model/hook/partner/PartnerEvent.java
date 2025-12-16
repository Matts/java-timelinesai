package io.github.matts.timelinesai.model.hook.partner;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.matts.timelinesai.model.hook.impl.EventTypeDeserializer;
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
    @JsonDeserialize(using = PartnerEventTypeDeserializer.class)
    private PartnerEvents event_type;
    private String partner_id;
    private Instant triggered_at;
}
