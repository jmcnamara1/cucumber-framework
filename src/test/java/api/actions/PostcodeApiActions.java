package api.actions;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.SessionData;
import utils.PropertyUtils;

import static utils.Constants.JSON_CONTENT_TYPE_HEADER;

public class PostcodeApiActions {

    private SessionData sessionData;
    private Response response;

    public PostcodeApiActions(SessionData sessionData) {
        this.sessionData = sessionData;
    }

    // POST request
    public void sendAPostRequestToPostcodeIoForMultiplePostcodes(List<String> postcodes) {
        setResponse(
                RestAssured.given()
                        .header(JSON_CONTENT_TYPE_HEADER)
                        .body(createPostcodeRequestBody(postcodes).toString())
                        .when()
                        .post(PropertyUtils.getPostCodeIoUrl()));
    }


    // GET request
    public void sendGetRequestToPostCodeIoForPostcodeOf(String postcode) {
        setResponse(
                RestAssured.given()
                        .when()
                        .get(PropertyUtils.getPostCodeIoUrl() + postcode));
        sessionData.setApiResponse(getResponse());
    }

    // Checks the response code is of value "code"
    public void validateResponseCode(int code) {
        Assert.assertEquals(getResponse().then().extract().statusCode(), code);
    }

    // Checks the response body has the value of "value" for field "field"
    public void checkFieldInResponseHasTheCorrectValue(String field, String value) {
        Assert.assertEquals(getResponse().then().extract().path("result." + field), value);
    }


    private JSONObject createPostcodeRequestBody(List<String> postcodes) {
        return new JSONObject().put("postcodes", new JSONArray(postcodes));
    }


    private Response getResponse() {
        return response;
    }

    private void setResponse(Response response) {
        this.response = response;
    }
}
