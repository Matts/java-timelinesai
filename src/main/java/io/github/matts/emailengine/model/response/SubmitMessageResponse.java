package io.github.matts.emailengine.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubmitMessageResponse {
    private String response;
    private String messageId;
    private String queueId;
    private String sentAt;
    private ResponseReference reference;
    private String preview;
}
