package io.github.matts.timelinesai.responses;

import io.github.matts.timelinesai.model.api.FileInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FileUploadResponse extends Response {
    private FileInfo data;

    public FileUploadResponse(String status, FileInfo data) {
        super(status);
        this.data = data;
    }
}
