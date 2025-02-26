package io.github.matts.timelinesai.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileInfo {
 private String temporary_download_url;
 private String uid;
 private String filename;
 private String size;
 private String mimetype;
 private String uploaded_by_email;
 private String uploaded_at;
}
