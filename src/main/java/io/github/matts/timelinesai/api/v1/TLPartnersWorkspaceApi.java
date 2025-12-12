package io.github.matts.timelinesai.api.v1;

import feign.HeaderMap;
import feign.Param;
import feign.RequestLine;
import io.github.matts.timelinesai.api.TimelinesAiApi;
import io.github.matts.timelinesai.model.api.WebhookListResponse;
import io.github.matts.timelinesai.request.CreateWorkspace;
import io.github.matts.timelinesai.responses.ApiTokenResponse;
import io.github.matts.timelinesai.responses.CreateWorkspaceResponse;
import io.github.matts.timelinesai.responses.GetWorkspaceResponse;
import io.github.matts.timelinesai.responses.QrCodeResponse;

import java.util.Map;

public interface TLPartnersWorkspaceApi extends TimelinesAiApi {
    @RequestLine("POST /partner/api/v1/workspaces/")
    CreateWorkspaceResponse createWorkspace(@HeaderMap Map<String, String> headers, CreateWorkspace body);

    @RequestLine("GET /partner/api/v1/workspaces/{workspace_id}/")
    GetWorkspaceResponse getWorkspace(@HeaderMap Map<String, String> headers, @Param("workspace_id") String workspace_id);

    @RequestLine("GET /partner/api/v1/workspaces/{workspace_id}/api_token")
    ApiTokenResponse getApiToken(@HeaderMap Map<String, String> headers, @Param("workspace_id") String workspace_id);

    @RequestLine("POST /partner/api/v1/workspaces/{workspace_id}/users/{user_id}/qr")
    QrCodeResponse getQrCode(@HeaderMap Map<String, String> headers, @Param("workspace_id") String workspace_id, @Param("user_id") String user_id);
}

