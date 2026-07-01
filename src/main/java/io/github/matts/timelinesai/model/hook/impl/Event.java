package io.github.matts.timelinesai.model.hook.impl;

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
    // event_type deserializes via EventType's @JsonCreator (Jackson 2 & 3 compatible).
    private EventType event_type;
}
