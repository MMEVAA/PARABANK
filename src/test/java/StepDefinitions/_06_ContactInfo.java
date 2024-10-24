package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _06_ContactInfo {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        ln.mySendKeys(ln.usernameHomePage, "Mahmut");
        ln.mySendKeys(ln.passwordHomePage, "12345");
        ln.myClick(ln.LogIn);


    }

    @Then("Click the find Update Contact Info button")
    public void clickTheFindUpdateContactInfoButton() {

        ln.myClick(ln.UpdateContactInfo);

    }

    @Then("Enter new user information")
    public void enterNewUserInformation() throws InterruptedException {

        Thread.sleep(1000);
        dc.mySendKeys(dc.firstName, "Miray");
        dc.mySendKeys(dc.lastName, "Cengiz");
        dc.mySendKeys(dc.address, "Seyhan");
        dc.mySendKeys(dc.city, "Adana");
        dc.mySendKeys(dc.state, "Arjantin");
        dc.mySendKeys(dc.zipCode, "44444");
        dc.mySendKeys(dc.phoneNumber, "03333333333");

    }

    @Then("Click on the update profile button")
    public void clickOnTheUpdateProfileButton() {

        dc.myClick(dc.updateProfile);
    }

    @And("Profile update should be done successfully")
    public void profileUpdateShouldBeDoneSuccessfully() {

        dc.LoginContainsText(dc.successMessage2, "Your updated address");

    }
}
