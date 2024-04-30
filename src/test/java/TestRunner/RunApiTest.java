package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepdef.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = {"classpath:stepdef"}, // Package where your step definitions are located
        tags = "@test1", // Tags to filter scenarios
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins to generate test reports
)
public class RunApiTest {
}
