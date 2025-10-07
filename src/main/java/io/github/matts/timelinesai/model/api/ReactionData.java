package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReactionData {
    private HashMap<String, Integer> reactions;
    private List<UserReactionData> users;
    private Integer total;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class UserReactionData {
        private String name;
        private String phone;
        private String reaction;
        private Boolean current;
    }
}
