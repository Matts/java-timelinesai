package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
@NoArgsConstructor
public class WebhookInfo {
    private int id;
    private String event_type;
    private Boolean enabled;
    private String url;
    private Integer errors_counter;
}
