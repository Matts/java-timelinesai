package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyInfo {
    private String full_name;
    private String phone;

    public String toUniqueAddress() {
        // remove all non-alphanumeric characters
        return phone.replaceAll("[^0-9]", "");
    }
}
