package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;

public class _03_BillPaymentFunctionality {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @Given("Navigate to Bill Pay")
    public void navigateToBillPay() {
        ln.myClick(ln.billPayButton);
    }

    @When("Send required fields and click send payment button")
    public void sendRequiredFieldsAndClickSendPaymentButton() {
//        ln.mySendKeys(ln.payeNameInput,"Enerjisa Elektrik Faturası");
        ln.mySendKeys(ln.addressInput,"Hurriyet");
        ln.mySendKeys(ln.cityInput,"istanbul");
        ln.mySendKeys(ln.stateInput,"Kagithane");
        ln.mySendKeys(ln.zipCodeInput,"34403");
        ln.mySendKeys(ln.phoneNumberInput,"05457657865");
        ln.mySendKeys(ln.accountNumberInput,"13899");
        ln.mySendKeys(ln.verifyAccountInput,"13899");
//        ln.mySendKeys(ln.amountInput,"7");
        ln.myClick(ln.sendPaymentButton);
    }

    @Then("User should be payed successfully")
    public void userShouldBePayedSuccessfully() {
        dc.LoginContainsText(ln.billPaymentCompleteText,"Bill Payment Complete");
        //dc.LoginContainsText(ln.amountText,"$7.00");
        dc.LoginContainsText(ln.accountNumberText,"13899");
    }

    @And("Navigate to Accounts Overview")
    public void navigateToAccountsOverview() {
        dc.myClick(ln.accountOverviewButton);
    }

    @When("Click the account number")
    public void clickTheAccountNumber() {
        dc.myClick(ln.accountNumber);
    }

    @Then("Check the payment information")
    public void checkThePaymentInformation() {
        dc.LoginContainsText(ln.paymentDate,"10-25-2024");
        //dc.LoginContainsText(ln.paymentName,"Bill Payment to Enerjisa Elektrik Faturası");
        //dc.LoginContainsText(ln.paymentAmount,"$7.00");
    }
    @Then("Check the payment information {string} and {string}")
    public void checkThePaymentInformation(String payeeName, String amount) {
        dc.LoginContainsText(ln.paymentName, "Bill Payment to " + payeeName);
        dc.LoginContainsText(ln.paymentAmount, "$" + amount + ".00");
    }

    @When("Send payee name as {string} amount as {string}")
    public void sendPayeeNameAsAmountAs(String payeeName, String amount) {
        ln.mySendKeys(ln.payeNameInput, payeeName);
        ln.mySendKeys(ln.amountInput,amount);

    }
}