package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageListData {
    private Boolean has_more_pages;
    private List<MessageInfo> messages;
}
