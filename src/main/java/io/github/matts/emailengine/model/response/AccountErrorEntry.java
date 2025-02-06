package io.github.matts.emailengine.model.response;

import io.github.matts.emailengine.model.TokenRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountErrorEntry {
    private String response;
    private String serverResponseCode;
    private TokenRequest tokenRequest;
}
