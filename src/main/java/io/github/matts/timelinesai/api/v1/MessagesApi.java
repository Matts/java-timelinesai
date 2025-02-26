package io.github.matts.timelinesai.api.v1;
import io.github.matts.timelinesai.request.FileUpload;
import io.github.matts.timelinesai.responses.FileUploadResponse;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.mock.web.MockMultipartFile;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.form.FormData;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.request.MessageToPhone;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;

public interface MessagesApi extends TimelinesAiApi {
    @RequestLine("POST /integrations/api/messages")
    Object sendMessage(MessageToPhone body);

    @RequestLine("POST /integrations/api/files")
    FileUploadResponse uploadFile(FileUpload body);
}
