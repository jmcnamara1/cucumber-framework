package api.steps;

import api.actions.ExampleStepActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ExampleStepDefs {


    ExampleStepActions exampleStepActions = new ExampleStepActions();

    @Given("I send a send get request to {string}")
    public void iSendASendGetRequestTo(String url) {
        exampleStepActions.sendGetRequestTo(url);
    }

    @Then("I validate the response code is {int}")
    public void iValidateTheResponseCodeIs(int code) {
        exampleStepActions.validateResponseCode(code);
    }
}
