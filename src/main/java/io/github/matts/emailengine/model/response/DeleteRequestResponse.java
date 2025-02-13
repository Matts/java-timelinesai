package io.github.matts.emailengine.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteRequestResponse {
    private String account;
    private boolean deleted;
}
