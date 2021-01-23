import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@exampleTest",
        features = "classpath:features/Postcodes.feature",
        glue = {"api.steps"},
        plugin = { "pretty", "html:target/cucumber-report.html"}

)

public class TestRunner {
}
