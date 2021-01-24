package models;

import io.restassured.response.Response;

public class SessionData {

    private Response apiResponse;

    public Response getApiResponse() {
        return apiResponse;
    }

    public void setApiResponse(Response apiResponse) {
        this.apiResponse = apiResponse;
    }
}
