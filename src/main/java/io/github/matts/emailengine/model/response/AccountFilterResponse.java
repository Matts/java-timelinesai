package io.github.matts.emailengine.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountFilterResponse extends FilterResponse {
    private List<AccountResponseItem> accounts;
}
