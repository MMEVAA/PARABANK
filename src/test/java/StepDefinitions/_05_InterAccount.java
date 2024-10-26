package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_InterAccount {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    public static String amountMoney;
    public static String fromAccountNo;
    public static String toAccountNo;

    public _05_InterAccount() {
    }

    @When("Create a Transfer Funds")
    public void createATransferFunds() {
        this.dc.myClick(this.ln.transferFunds);
    }

    @Then("selects a sender and receiver account. in the amount field enters the amount and clicks the button")
    public void selectsASenderAndReceiverAccountInTheAmountFieldEntersTheAmountAndClicksTheButton() throws InterruptedException {
        String amountRnd = RandomStringUtils.randomNumeric(2);
        dc.mySendKeys(dc.amount, amountRnd);
        Thread.sleep(5000L);
        dc.mySelecIndex(dc.fromAccount, 0);
        dc.mySelecIndex(dc.toAccountTransfer, 1);
        dc.myClick(dc.transferButton);
        amountMoney =dc.amountResult.getText();
        fromAccountNo =dc.fromAccountIdResult.getText();
        toAccountNo = dc.toAccountIdResult.getText();
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText(dc.transferText, " has been transferred from account #");
    }

    @And("Navigate to Accounts Overview dialog content")
    public void navigateToAccountsOverview() {
        dc.myClick(ln.accountsOverview);
    }

    @And("The user clicks on the recipient account number. list the transfer date and the amount of money received in the account. credit verifies")
    public void theUserClicksOnTheRecipientAccountNumberListTheTransferDateAndTheAmountOfMoneyReceivedInTheAccountCreditVerifies() {
        WebElement toAccountLoceters = GWD.getDriver().findElement(By.linkText(toAccountNo));
        dc.javaScripClick(toAccountLoceters);

        WebElement amountMoneyLoceters = GWD.getDriver().findElement(By.linkText(amountMoney));
        dc.verifyMessageContainsText(amountMoneyLoceters, amountMoney);
    }
}
