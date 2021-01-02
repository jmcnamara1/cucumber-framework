import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@exampleTest",
        features = "classpath:features/Example.feature",
        glue = {"api.steps"}

)

public class GeneralRunner {
}
