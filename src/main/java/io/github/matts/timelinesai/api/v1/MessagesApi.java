package io.github.matts.timelinesai.api.v1;
import feign.HeaderMap;
import feign.Param;
import io.github.matts.timelinesai.model.api.MessageSentResponse;
import io.github.matts.timelinesai.request.FileUpload;
import io.github.matts.timelinesai.request.MessageToJid;
import io.github.matts.timelinesai.responses.FileUploadResponse;
import feign.RequestLine;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.request.MessageToPhone;

import java.util.Map;

public interface MessagesApi extends TimelinesAiApi {
    @RequestLine("POST /integrations/api/messages")
    MessageSentResponse sendMessageInternal(@HeaderMap Map<String, String> headers, MessageToPhone body);

    @RequestLine("POST /integrations/api/messages/to_jid")
    MessageSentResponse sendMessageInternal(@HeaderMap Map<String, String> headers, MessageToJid body);

    @RequestLine("POST /integrations/api/files")
    FileUploadResponse uploadFile(@HeaderMap Map<String, String> headers, FileUpload body);

    default MessageSentResponse sendMessage(Map<String, String> headers, MessageToPhone body) {
        try {
            return sendMessageInternal(headers, body);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    default MessageSentResponse sendMessage(Map<String, String> headers, MessageToJid body) {
        try {
            return sendMessageInternal(headers, body);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
