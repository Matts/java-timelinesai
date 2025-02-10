package io.github.matts.emailengine.model.response;

import io.github.matts.emailengine.model.MessageEntry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MessageList {
    private int total;
    private int page;
    private int pages;
    private String nextPageCursor;
    private String previousPageCursor;
    private List<MessageEntry> messages;
}
