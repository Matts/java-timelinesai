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
public class WhatsappAccountConnected extends PartnerEvent {
    private Integer user_id;
    private Integer whatsapp_account_id;
    private String phone_number_e164;

    @Builder
    public WhatsappAccountConnected(String workspace_id, PartnerEvents event_type, String partner_id, Instant triggered_at, Integer user_id, Integer whatsapp_account_id, String phone_number_e164) {
        super(workspace_id, event_type, partner_id, triggered_at);
        this.user_id = user_id;
        this.whatsapp_account_id = whatsapp_account_id;
        this.phone_number_e164 = phone_number_e164;
    }
}
