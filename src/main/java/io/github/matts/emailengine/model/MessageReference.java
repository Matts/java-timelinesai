package io.github.matts.emailengine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
public class MessageReference {
    private String message;
    private MessageReferenceAction action;
    private Boolean inline;
    private Boolean forwardAttachments;
    private Boolean ignoreMissing;
    private String messageId;
}
