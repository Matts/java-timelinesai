package io.github.matts.timelinesai.model.hook.partner;

import io.github.matts.timelinesai.model.hook.partner.events.ApiTokenRotatedEvent;
import io.github.matts.timelinesai.model.hook.partner.events.WhatsappAccountConnected;
import io.github.matts.timelinesai.model.hook.partner.events.WhatsappAccountDisconnected;
import lombok.Getter;

@Getter
public enum PartnerEvents {
    API_TOKEN_ROTATED("api_token:rotated", ApiTokenRotatedEvent.class),
    WHATSAPP_ACCOUNT_CONNECTED("whatsapp_account:connected", WhatsappAccountConnected.class),
    WHATSAPP_ACCOUNT_DISCONNECTED("whatsapp_account:disconnected", WhatsappAccountDisconnected.class),


    ;

    private final String eventType;
    private final Class<? extends PartnerEvent> eventClass;

    PartnerEvents(String s, Class<? extends PartnerEvent> eventClass) {
        this.eventType = s;
        this.eventClass = eventClass;
    }

    public static PartnerEvents fromString(String eventType) {
        for (PartnerEvents event : PartnerEvents.values()) {
            if (event.getEventType().equalsIgnoreCase(eventType)) {
                return event;
            }
        }
        throw new IllegalArgumentException("Unknown event type: " + eventType);
    }
}
