package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.data.AuthenticationEventData;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AuthenticationEvent extends Event {
    private AuthenticationEventData data;

    @Builder
    public AuthenticationEvent(String serviceUrl, String account, String date, Events event, AuthenticationEventData data) {
        super(serviceUrl, account, date, event);
        this.data = data;
    }
}
