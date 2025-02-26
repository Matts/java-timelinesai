package io.github.matts.timelinesai.client;

import java.util.HashMap;

public class ApiRequest extends HashMap<String,String> {
    public ApiRequest(String apiKey) {
        super();
        this.put("Authorization", "Bearer "+apiKey);
    }
}
