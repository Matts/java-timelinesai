package io.github.matts.timelinesai.api.v1;

import feign.HeaderMap;
import feign.Param;
import feign.RequestLine;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.responses.ChatListResponse;
import io.github.matts.timelinesai.responses.MessageListResponse;

import java.util.Map;

public interface ChatsApi extends TimelinesAiApi {
    @RequestLine("GET /integrations/api/chats?page={page}")
    ChatListResponse listChats(@HeaderMap Map<String, String> headers, @Param("page") Integer page);

    @RequestLine("GET /integrations/api/chats/{chatId}/messages?page={page}&after_message={afterMessage}&after={after}")
    MessageListResponse listMessages(@HeaderMap Map<String, String> headers, @Param("chatId") String chatId, @Param("afterMessage") String afterMessage, @Param("after") String after, @Param("page") Integer page);
}
