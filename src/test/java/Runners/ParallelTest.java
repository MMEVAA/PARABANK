package Runners;


import Utilities.GWD;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                "src/test/java/FeatureFiles/_04_CountryMultipleScenarios.feature",
                "src/test/java/FeatureFiles/_03_CitizenShip.feature"
        },
        glue = {"StepDefinitions"}
)
public class ParallelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserTipi)
    {
        GWD.threadBrowserName.set(browserTipi);

    }

}