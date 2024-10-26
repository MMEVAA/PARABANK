package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement repeatedPassword;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement updateProfile;

    @FindBy(xpath = "//*[contains(text(),'Your updated address')]")
    public WebElement successMessage2;


    @FindBy(id = "amount")
    public WebElement loanAmountBox;

    @FindBy(id = "downPayment")
    public WebElement downPaymentBox;

    @FindBy(name = "fromAccountId")
    public List<WebElement> selectAccountNumber;

    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//div[@ng-show='showResult']")
    public WebElement loanReqProcessText;

    @FindBy(xpath = "//div[@id='loanStatus']")
    public WebElement approvedText;

    @FindBy(xpath = "//a[contains(text(),'Account Number')]")
    public WebElement newAccountNumberBtn;

    @FindBy(xpath = "//h1[text()='Account Details']")
    public WebElement accountDetailsText;

    @FindBy(xpath = "//td[text()='LOAN']")
    public WebElement loanAccountText;

    @FindBy(xpath = "//td[text()='$2,000.00']")
    public WebElement balanceText;

    @FindBy(xpath = "//td[text()='No Transactions Found.']")
    public WebElement noTransactionText;

    @FindBy(xpath = "//div[@class='error']")
    public WebElement deniedText;

    @FindBy(xpath = "//div[@class='error']/p")
    public WebElement errorMessage;



    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement headText;

    @FindBy(xpath = "//select[@id='type']")
    public WebElement openNewAccountSelect;

    @FindBy(xpath = "(//form//p//b)[2]")
    public WebElement minimumbalanceMesage;

    @FindBy(xpath = "//form//select[@id='fromAccountId']")
    public WebElement fromAccount;

    @FindBy(xpath = "//input[@value='Open New Account']")
    public WebElement openNewAccountButton;

    @FindBy(xpath = "//div[@id='openAccountResult']/p")
    public WebElement congratulationsMessage;

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountNumber;

    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement equalAccountNumber;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amount;


    @FindBy(xpath = "//form//select[@id='toAccountId']")
    public WebElement toAccountTransfer;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement transferButton;

    @FindBy(xpath = "//span[@id='amountResult']")
    public WebElement amountResult;

    @FindBy(xpath = "//span[@id='fromAccountIdResult']")
    public WebElement fromAccountIdResult;

    @FindBy(xpath = "//span[@id='toAccountIdResult']")
    public WebElement toAccountIdResult;

    @FindBy(xpath = "//*[text()=' has been transferred from account #']")
    public WebElement transferText;

}

