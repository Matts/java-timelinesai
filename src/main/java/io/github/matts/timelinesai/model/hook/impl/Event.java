package io.github.matts.timelinesai.model.hook.impl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.matts.timelinesai.model.hook.data.WhatsappAccountInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Event {
    @JsonDeserialize(using = EventTypeDeserializer.class)
    private EventType event_type;
}
