package io.github.matts.emailengine.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MailboxResponseStatus {
    private int messages;
    private int unseen;
}
