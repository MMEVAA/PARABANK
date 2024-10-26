package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _04_AccountCreation {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    public _04_AccountCreation() {
    }

    @Given("Navigate to ParaBank")
    public void navigateToCampus() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }




    @And("Open New Account from the website menu Clicks on the Account link in LefNav")
    public void openNewAccountFromTheWebsiteMenuClicksOnTheAccountLinkInLefNav() {
        dc.myClick(ln.openNewAccount);
    }

    @And("The user can select the account type as Current Checking from the drop-down menu. chooses. in Dialog")
    public void theUserCanSelectTheAccountTypeAsCurrentCheckingFromTheDropDownMenuChoosesInDialog() {
        dc.mySelecTtext(dc.openNewAccountSelect, "CHECKING");
    }

    @And("The user must have a minimum balance Min. Balance in the new bank account.receives a warning that it must be found mesage")
    public void theUserMustHaveAMinimumBalanceMinBalanceInTheNewBankAccountReceivesAWarningThatItMustBeFoundMesage() {
        dc.verifyMessageContainsText(dc.minimumbalanceMesage, "A minimum of $200,00 must be deposited into this account at time of opening. Please choose an existing account to transfer funds into the new account.");
    }

    @And("The user selects the account to which they will transfer the minimum balance from the drop-down menu. in Dialog")
    public void theUserSelectsTheAccountToWhichTheyWillTransferTheMinimumBalanceFromTheDropDownMenuInDialog() throws InterruptedException {
        Thread.sleep(2000);
        dc.mySelecIndex(dc.fromAccount, 0);
    }

    @And("The user clicks on the Open New Account button. in Dialog")
    public void theUserClicksOnTheOpenNewAccountButtonInDialog() {
        dc.myClick(dc.openNewAccountButton);
    }

    @And("The user confirms that the new bank account has been created successfully. verifies and sees the account number.")
    public void theUserConfirmsThatTheNewBankAccountHasBeenCreatedSuccessfullyVerifiesAndSeesTheAccountNumber() {
        dc.verifyMessageContainsText(dc.congratulationsMessage, "Congratulations, your account is now open.");
        String newAccountNu =dc.wait.until(ExpectedConditions.elementToBeClickable(dc.newAccountNumber)).getText();
        dc.myClick(dc.newAccountNumber);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.equalAccountNumber));
        Assert.assertTrue(newAccountNu.contains(dc.equalAccountNumber.getText()));
    }

    @And("The user can select the account type as Current Savings from the drop-down menu. chooses. in Dialog")
    public void theUserCanSelectTheAccountTypeAsCurrentSavingsFromTheDropDownMenuChoosesInDialog() {
        dc.mySelecTtext(dc.openNewAccountSelect, "SAVINGS");
    }
}
