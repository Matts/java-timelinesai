package io.github.matts.emailengine.model;

import lombok.Getter;

@Getter
public class MailboxEntry {
    private String path;
    private String delimiter;
    private String parentPath;
    private String name;
    private boolean listed;
    private boolean subscribed;
    private String specialUse;
    private String specialUseSource;
    private boolean noInferiors;
    private int messages;
    private int uidNext;
    private MailboxResponseStatus status;
}
