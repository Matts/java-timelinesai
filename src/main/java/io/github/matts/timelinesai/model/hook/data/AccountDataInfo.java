package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDataInfo {
    private String id;
    private String phone;
    private Date connected_on;
    private Date disconnected_on;
    private String status;
    private String account_name;
    private String owner_name;
    private String owner_email;
}
