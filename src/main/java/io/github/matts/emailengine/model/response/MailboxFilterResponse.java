package io.github.matts.emailengine.model.response;

import io.github.matts.emailengine.model.MailboxEntry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailboxFilterResponse {
    private List<MailboxEntry> mailboxes;
}
