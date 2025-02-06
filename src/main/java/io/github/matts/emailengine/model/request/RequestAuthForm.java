package io.github.matts.emailengine.model.request;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
public class RequestAuthForm {
    private String account;
    private String name;
    private String email;
    private boolean delegated;
    private String notifyFrom;
    private List<String> path;
    private String redirectUrl;
    private String type;

    public RequestAuthForm(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public RequestAuthForm(String account, String name, String email, String redirectUrl, String type) {
        this.account = account;
        this.name = name;
        this.email = email;
        this.redirectUrl = redirectUrl;
        this.type = type;
    }

}
