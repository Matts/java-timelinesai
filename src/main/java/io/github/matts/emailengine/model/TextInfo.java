package io.github.matts.emailengine.model;

import lombok.Getter;

@Getter
public class TextInfo {
    private String id;
    private EncodedSize encodedSize;
    private String plain;
    private String html;
    private boolean hasMore;
}
