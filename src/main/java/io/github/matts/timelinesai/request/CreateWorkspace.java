package io.github.matts.timelinesai.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateWorkspace {
    private String display_name;
    private int seats_purchased;
}
