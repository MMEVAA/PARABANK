package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "SmokeTest or RegressionTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/site/cucumber-pretty.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
