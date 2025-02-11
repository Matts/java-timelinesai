package io.github.matts.emailengine.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MessageUploadResponse {
    private String id;
    private String path;
    private Integer uid;
    private String uidValidity;
    private Integer seq;
    private String messageId;
    private ResponseReference reference;
}
