package StepDefinitions;

import Pages.LeftNav;
import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class _07_LoanApplication {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("The user navigates to the ParaBank website 1")
    public void the_user_navigates_to_the_ParaBank_website() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("The user types username and password and clicks on the login button 1")
    public void the_user_types_username_and_password_and_clicks_on_the_login_button() {
        ln.loginUsername.sendKeys("Duman");
        ln.loginPassword.sendKeys("duman;)");
        ln.loginBtn.click();
    }

    @Then("The user should login successfully 1")
    public void the_user_should_login_successfully() {
        Assert.assertTrue(ln.welcomeControl.isDisplayed());
    }

    @When("The user clicks on Request Loan button")
    public void the_user_clicks_on_Request_Loan_button() {
        ln.requestLoanBtn.click();
    }

    @When("The user types Loan Amount Box and DownPaymentBox")
    public void the_user_types_Loan_Amount_Box_and_DownPaymentBox(io.cucumber.datatable.DataTable dataTable) {
        var data = dataTable.asMap(String.class, String.class);
        dc.loanAmountBox.sendKeys(data.get("loanAmountBox"));
        dc.downPaymentBox.sendKeys(data.get("downPaymentBox"));
    }

    @When("The user selects the account number from the Drop-Down menu")
    public void the_user_selects_the_account_number_from_the_Drop_Down_menu() {
        dc.selectAccountNumber.get(0).click();
    }

    @When("The user clicks on the Apply Now button")
    public void the_user_clicks_on_the_Apply_Now_button() {
        dc.applyNowButton.click();
    }

    @Then("The user verifies the confirmation message")
    public void the_user_verifies_the_confirmation_message() {
        Assert.assertTrue(dc.loanReqProcessText.isDisplayed());
        Assert.assertEquals("Congratulations, Your Loan Has Been Approved.", dc.approvedText.getText());
    }

    @Then("The user clicks on new account number")
    public void the_user_clicks_on_new_account_number() {
        dc.newAccountNumberBtn.click();
    }

    @Then("The user verifies the details of the Account Details")
    public void the_user_verifies_the_details_of_the_Account_Details() {
        Assert.assertTrue(dc.accountDetailsText.isDisplayed());
        Assert.assertEquals("LOAN", dc.loanAccountText.getText());
        Assert.assertEquals("$2,000.00", dc.balanceText.getText());
        Assert.assertEquals("No Transactions Found.", dc.noTransactionText.getText());
    }

    @Then("The user displays the denied message")
    public void the_user_displays_the_denied_message() {
        Assert.assertTrue(dc.deniedText.isDisplayed());
        Assert.assertEquals("You do not have sufficient funds for the given down payment.", dc.errorMessage.getText());
    }
}
