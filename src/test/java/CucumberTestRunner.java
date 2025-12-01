import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features", // Path to the feature files
        glue = "stepdefinitions",  // Path to step definition package
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true,  // Readable console output
        tags = "@smoke"  // You can run tests with specific tags
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
    @Test
    public void runCucumber() {
        // This will run the Cucumber tests with TestNG
    }

    @Override
    @DataProvider(parallel = true)  // <<< enables scenario-level parallelism
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
