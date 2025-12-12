package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatInfo {
    private Integer total;
    private Integer used;
    private Boolean full;
    private Boolean near_full;
    private Integer available;
}
