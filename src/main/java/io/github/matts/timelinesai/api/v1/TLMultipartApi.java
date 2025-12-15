package io.github.matts.timelinesai.api.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.*;
import feign.form.FormData;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.model.api.MessageSentResponse;
import io.github.matts.timelinesai.request.MessageToChat;
import io.github.matts.timelinesai.responses.ChatListResponse;
import io.github.matts.timelinesai.responses.MessageListResponse;

import java.util.HashMap;
import java.util.Map;

public interface TLMultipartApi extends TimelinesAiApi {
    @RequestLine("POST /integrations/api/chats/{chatId}/voice_message")
    @Headers("Content-Type: multipart/form-data")
    MessageSentResponse uploadVoice(
            @HeaderMap Map<String, String> headers,
            @Param("chatId") long chatId,
            @Param("file") FormData file
    );
}
