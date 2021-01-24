package api.actions;

import org.junit.Assert;

import models.SessionData;

public class AssertionActions {

    private SessionData sessionData;

    public AssertionActions(SessionData sessionData) {
        this.sessionData = sessionData;
    }

    // Checks the response code is of value "code"
    public void validateResponseCode(int code) {
        Assert.assertEquals(sessionData.getApiResponse().then().extract().statusCode(), code);
    }
}
