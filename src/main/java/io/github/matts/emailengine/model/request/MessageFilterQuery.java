package io.github.matts.emailengine.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
public class MessageFilterQuery {
    private String cursor;
    private Integer pageSize;
    private String path;
}
