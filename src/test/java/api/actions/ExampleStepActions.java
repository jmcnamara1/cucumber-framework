package api.actions;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExampleStepActions{



    private Response response;


    public void sendGetRequestTo(String url) {
        setResponse(
                RestAssured.given().when().get(url)
        );
    }

    public void validateResponseCode(int code) {
        Assert.assertEquals(getResponse().then().extract().statusCode(), code);
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
