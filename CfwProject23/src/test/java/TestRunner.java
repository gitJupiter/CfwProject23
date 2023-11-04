

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //path of feature file
        features = "src/test/java/features",
        //path of step definition file
        glue = "stepDef",
        plugin = {
                "json:target/cucumber.json",
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
