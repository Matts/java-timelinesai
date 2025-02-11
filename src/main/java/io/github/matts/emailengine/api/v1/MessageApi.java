package io.github.matts.emailengine.api.v1;

import feign.FeignException;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.api.MessageFilterQuery;
import io.github.matts.emailengine.model.request.MessageSearchQuery;
import io.github.matts.emailengine.model.response.AccountFilterResponse;
import io.github.matts.emailengine.model.response.MessageList;

public interface MessageApi extends EmailEngineApi {
    @RequestLine("GET /v1/account/{accountId}/messages")
    MessageList listMessagesInternal(@Param("accountId") String accountId, @Param("path") String path, @QueryMap MessageFilterQuery queryMap);

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
