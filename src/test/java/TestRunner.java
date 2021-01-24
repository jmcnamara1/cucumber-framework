import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test",
        features = "classpath:features/SharedState.feature",
        glue = {"api.steps"},
        plugin = { "pretty", "html:target/cucumber-report.html"}

)

public class TestRunner {
}
