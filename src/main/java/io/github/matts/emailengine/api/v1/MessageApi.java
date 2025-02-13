package io.github.matts.emailengine.api.v1;

import feign.*;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.model.request.MessageFilterQuery;
import io.github.matts.emailengine.model.request.MessageInformationQuery;
import io.github.matts.emailengine.model.MessageEntry;
import io.github.matts.emailengine.model.request.MessageSearchQuery;
import io.github.matts.emailengine.model.request.MessageUpload;
import io.github.matts.emailengine.model.response.MessageList;
import io.github.matts.emailengine.model.response.MessageUploadResponse;
import io.github.matts.emailengine.model.response.SubmitMessageResponse;

public interface MessageApi extends EmailEngineApi {
    @RequestLine("GET /v1/account/{accountId}/messages")
    MessageList listMessagesInternal(@Param("accountId") String accountId, @Param("path") String path, @QueryMap MessageFilterQuery queryMap);

    @RequestLine("GET /v1/account/{accountId}/message/{message}")
    MessageEntry getMessageInformation(@Param("accountId") String accountId, @Param("message") String message, @QueryMap MessageInformationQuery queryMap);

    @Headers("Content-Type: application/ocelot-stream")
    @RequestLine("GET /v1/account/{accountId}/attachment/{attachment}")
    Response getAttachment(@Param("accountId") String accountId, @Param("attachment") String attachment);

    @RequestLine("POST /v1/account/{accountId}/message")
    MessageUploadResponse uploadMessage(@Param("accountId") String accountId, MessageUpload message);

    @RequestLine("POST /v1/account/{accountId}/submit")
    SubmitMessageResponse submitMessage(@Param("accountId") String accountId, MessageUpload message);


    @RequestLine("POST /v1/account/{accountId}/search")
    MessageList searchMessagesInternal(MessageSearchQuery.Form request, @Param("accountId") String accountId, @QueryMap MessageFilterQuery queryMap);

    default MessageList listMessages(String accountId, String path, MessageFilterQuery queryMap) {
        try {
            return listMessagesInternal(accountId, path, queryMap);
        } catch (FeignException e) {
            e.printStackTrace();
            return null;
        }
    }

    default MessageList searchMessages(MessageSearchQuery.Form request, String accountId, MessageFilterQuery queryMap) {
        try {
            return searchMessagesInternal(request, accountId, queryMap);
        } catch (FeignException e) {
            e.printStackTrace();
            return null;
        }
    }
}
