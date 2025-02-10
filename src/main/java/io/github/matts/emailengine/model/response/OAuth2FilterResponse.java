package io.github.matts.emailengine.model.response;

import io.github.matts.emailengine.model.AccountEntry;
import io.github.matts.emailengine.model.OAuth2Entry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OAuth2FilterResponse extends FilterResponse {
    private List<OAuth2Entry> apps;
}
