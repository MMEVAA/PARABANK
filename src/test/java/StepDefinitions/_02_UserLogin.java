package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class _02_UserLogin {

    LeftNav ln = new LeftNav();

    @Given("The user navigates to the ParaBank website")
    public void the_user_navigates_to_the_ParaBank_website() {
        GWD.getDriver().get("http://parabank.parasoft.com");
    }

    @When("The user types username and password and clicks on the login button")
    public void the_user_types_username_and_password_and_clicks_on_the_login_button() {
        ln.loginUsername.sendKeys("Mazlum");
        ln.loginPassword.sendKeys("12345");
        ln.loginBtn.click();
    }

    @Then("The user should login successfully")
    public void the_user_should_login_successfully() {

        Assert.assertTrue(ln.loginControl.getText().contains("Accounts Overview"));
    }

    @When("The user types invalid username and invalid password and clicks on the login button")
    public void the_user_types_invalid_username_and_invalid_password_and_clicks_on_the_login_button() {
        ln.loginUsername.sendKeys("Fatmanur");
        ln.loginPassword.sendKeys("1234f");
        ln.loginBtn.click();
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertTrue(ln.errorMessage.getText().contains("The username and password could not be verified."));
    }
}
