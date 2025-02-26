package io.github.matts.timelinesai.api.v1;
import feign.HeaderMap;
import feign.Param;
import io.github.matts.timelinesai.request.FileUpload;
import io.github.matts.timelinesai.request.MessageToJid;
import io.github.matts.timelinesai.responses.FileUploadResponse;
import feign.RequestLine;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.request.MessageToPhone;

import java.util.Map;

public interface MessagesApi extends TimelinesAiApi {
    @RequestLine("POST /integrations/api/messages")
    Object sendMessage(@HeaderMap Map<String, String> headers, MessageToPhone body);

    @RequestLine("POST /integrations/api/messages/to_jid")
    Object sendMessage(@HeaderMap Map<String, String> headers, MessageToJid body);

    @RequestLine("POST /integrations/api/files")
    FileUploadResponse uploadFile(@HeaderMap Map<String, String> headers, FileUpload body);
}
