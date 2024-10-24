package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_UserRegistration {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("Navigate to Parabank")
    public void navigateToParabank() {

        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Click on the register button")
    public void clickOnTheRegisterButton() {

        ln.myClick(ln.registerButton);

    }

    @Then("Fill in login information")
    public void fillInLoginInformation() {

        dc.mySendKeys(dc.firstName, "Mahmut");
        dc.mySendKeys(dc.lastName, "Kaya");
        dc.mySendKeys(dc.address, "Nişantaşı");
        dc.mySendKeys(dc.city, "İstanbul");
        dc.mySendKeys(dc.state, "Türkiye");
        dc.mySendKeys(dc.zipCode, "55555");
        dc.mySendKeys(dc.phoneNumber, "05555555555");
        dc.mySendKeys(dc.ssn, "55555555555");
        dc.mySendKeys(dc.username, "Mahmut");
        dc.mySendKeys(dc.password, "12345");
        dc.mySendKeys(dc.repeatedPassword, "12345");
        dc.myClick(dc.registerButton);

    }

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {

        dc.LoginContainsText(dc.successMessage, "successfully");
    }
}
