package io.github.matts.emailengine.model.request;

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
public class MessageInformationQuery {
    private Integer maxBytes;
    private String textType;
    private Boolean webSafeHtml;
    private Boolean embedAttachedImages;
    private Boolean preProcessHtml;
    private Boolean markAsSeen;
}
