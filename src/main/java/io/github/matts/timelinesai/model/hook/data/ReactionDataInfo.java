package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReactionDataInfo {
    private UUID message_uid;
    private ReactionAction action;
    private String emoji;
    private String timestamp;
    private PartyInfo reactor;
    private HashMap<String, Integer> reactions;
}
