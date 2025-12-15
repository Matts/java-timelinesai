package io.github.matts.timelinesai.api.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.*;
import feign.form.FormData;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.model.api.MessageSentResponse;
import io.github.matts.timelinesai.request.FileUpload;
import io.github.matts.timelinesai.request.MessageToChat;
import io.github.matts.timelinesai.request.MessageToJid;
import io.github.matts.timelinesai.request.MessageToPhone;
import io.github.matts.timelinesai.responses.ChatListResponse;
import io.github.matts.timelinesai.responses.FileUploadResponse;
import io.github.matts.timelinesai.responses.MessageListResponse;

import java.util.HashMap;
import java.util.Map;

public interface TLChatsApi extends TimelinesAiApi {
    @RequestLine("GET /integrations/api/chats?whatsapp_account_id={whatsapp_account_id}&page={page}&created_after={createdAfter}&created_before={createdBefore}")
    ChatListResponse listChats(@HeaderMap Map<String, String> headers, @Param("whatsapp_account_id") String whatsapp_account_id, @Param("page") Integer page, @Param("createdAfter") String createdAfter, @Param("createdBefore") String createdBefore);

    @RequestLine("GET /integrations/api/chats/{chatId}/messages?page={page}&after_message={afterMessage}&after={after}")
    MessageListResponse listMessages(@HeaderMap Map<String, String> headers, @Param("chatId") String chatId, @Param("afterMessage") String afterMessage, @Param("after") String after, @Param("page") Integer page);

    @RequestLine("POST /integrations/api/chats/{chatId}/messages")
    MessageSentResponse sendMessageInternal(@HeaderMap Map<String, String> headers, @Param("chatId") String chatId, MessageToChat body);

    default MessageSentResponse sendMessage(Map<String, String> headers, @Param("chatId") String chatId, MessageToChat body) {
        try {
            return sendMessageInternal(headers, chatId, body);
        } catch (FeignException.BadRequest | FeignException.Forbidden | FeignException.NotFound e) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                return mapper.readValue(e.contentUTF8(), MessageSentResponse.class);
            } catch (Exception parseEx) {
                parseEx.printStackTrace();
                return null;
            }
        } catch (FeignException.Unauthorized e) {
            HashMap<String, String> errorResponse = new HashMap<>();
            errorResponse.put("status", "401");
            return new MessageSentResponse("error", "Unauthorized access. Please check your API key or authentication method.", errorResponse);
        } catch (FeignException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
