package io.github.matts.emailengine.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AttachmentEntry {
    private String id;
    private String contentType;
    private int encodedSize;
    private boolean embedded;
    private boolean inline;
    private String contentId;
    private String filename;
    private String method;
}
