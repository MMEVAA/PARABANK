package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import Utilities.GWD;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}

)

public class Parallel_AllRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserType")
    public void beforeClass(String browserName) {
        GWD.threadBrowserName.set(browserName);
    }
}