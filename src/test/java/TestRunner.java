import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test",
        features = "classpath:features",
        glue = {"api.steps"},
        plugin = { "pretty", "html:target/cucumber-report.html"}

)

public class TestRunner {
}
