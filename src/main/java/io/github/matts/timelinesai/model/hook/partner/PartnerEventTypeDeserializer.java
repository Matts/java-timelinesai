package io.github.matts.timelinesai.model.hook.partner;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.github.matts.timelinesai.model.hook.impl.EventType;

import java.io.IOException;

public class PartnerEventTypeDeserializer extends JsonDeserializer<PartnerEvents> {
    @Override
    public PartnerEvents deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getText();
        return PartnerEvents.fromString(value); // Returns null if not found
    }
}