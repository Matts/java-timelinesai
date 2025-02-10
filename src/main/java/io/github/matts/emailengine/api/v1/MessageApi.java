package io.github.matts.emailengine.api.v1;

import feign.FeignException;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import io.github.matts.emailengine.api.EmailEngineApi;
import io.github.matts.emailengine.api.MessageFilterQuery;
import io.github.matts.emailengine.model.response.AccountFilterResponse;
import io.github.matts.emailengine.model.response.MessageList;

public interface MessageApi extends EmailEngineApi {
    @RequestLine("GET /v1/account/{accountId}/messages?path={path}")
    MessageList listMessagesInternal(@Param("accountId") String accountId, @Param("path") String path, @QueryMap MessageFilterQuery queryMap);

    default MessageList listMessages(String accountId, String path, MessageFilterQuery queryMap) {
        try {
            return listMessagesInternal(accountId, path, queryMap);
        } catch (FeignException e) {
            return null;
        }
    }
}
