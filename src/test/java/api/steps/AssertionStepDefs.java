package api.steps;

import api.actions.AssertionActions;
import io.cucumber.java.en.Then;
import models.SessionData;

public class AssertionStepDefs {

    private SessionData sessionData;
    private AssertionActions assertionActions;

    public AssertionStepDefs(SessionData sessionData) {
        // Dependency is injected by pico container
        this.sessionData = sessionData;
        this.assertionActions = new AssertionActions(this.sessionData);
    }

    @Then("I check the response has the status code of {int}")
    public void iCheckTheResponseHasTheStatusCodeOf(int code) {
        assertionActions.validateResponseCode(code);
    }


}
