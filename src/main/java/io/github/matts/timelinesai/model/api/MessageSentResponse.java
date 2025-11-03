package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageSentResponse {
    private String status;
    private String message;
    private HashMap<String,String> data;
    private List<HashMap<String,Object>> errors;

    public MessageSentResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public MessageSentResponse(String status, String message, HashMap<String,String> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
