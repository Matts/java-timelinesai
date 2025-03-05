package io.github.matts.timelinesai.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachmentInfo {
    private String temporary_download_url;
    private String filename;
    private Integer size;
    private String mimetype;
}
