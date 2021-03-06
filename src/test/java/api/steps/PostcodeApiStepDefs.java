package api.steps;

import java.util.List;

import api.actions.PostcodeApiActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import models.SessionData;

public class PostcodeApiStepDefs {

    private SessionData sessionData;
    private PostcodeApiActions postcodeApiActions;

    public PostcodeApiStepDefs(SessionData sessionData) {
        // Dependency is injected by pico container
        this.sessionData = sessionData;
        this.postcodeApiActions = new PostcodeApiActions(this.sessionData);
    }


    @Given("I send a post request to postcode.io to search for the following postcodes")
    public void iSendAPostRequestToPostcodeIoToSearchForTheFollowingPostcodes(List<String> postcodes) {
        postcodeApiActions.sendAPostRequestToPostcodeIoForMultiplePostcodes(postcodes);
    }

    @Then("I validate the postcode api response code is {int}")
    public void iValidateThePostcodeApiResponseCodeIs(int code) {
        postcodeApiActions.validateResponseCode(code);
    }

    @Given("I send a get request to postcode.io for the postcode {string}")
    public void iSendAGetRequestToPostcodeIoForThePostcode(String postcode) {
        postcodeApiActions.sendGetRequestToPostCodeIoForPostcodeOf(postcode);
    }

    @And("I check the field {string} has the correct value of {string}")
    public void iCheckTheFieldHasTheCorrectValueOf(String field, String value) {
        postcodeApiActions.checkFieldInResponseHasTheCorrectValue(field, value);
    }

}
