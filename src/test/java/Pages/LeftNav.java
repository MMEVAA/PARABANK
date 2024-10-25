package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage {

    public LeftNav() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement UpdateContactInfo;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameHomePage;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordHomePage;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement LogIn;

    @FindBy(css = "[class='login']>input[name='username']")
    public WebElement loginUsername;

    @FindBy(css = "[class='login']>input[name='password']")
    public WebElement loginPassword;

    @FindBy(css = "[class='login']>input[type='submit']")
    public WebElement loginBtn;

    @FindBy(css = "[id='leftPanel']>h2")
    public WebElement loginControl;

    @FindBy(css = "[class='error']")
    public WebElement errorMessage;

    @FindBy(xpath = "//h2[text()='Accounts Overview']")
    public WebElement welcomeControl;

    @FindBy(xpath = "//a[text()='Request Loan']")
    public WebElement requestLoanBtn;

    @FindBy(linkText= "Bill Pay")
    public WebElement billPayButton;

    @FindBy(xpath= "//input[@name='payee.name']")
    public WebElement payeNameInput;

    @FindBy(xpath= "//input[@name='payee.address.street']")
    public WebElement addressInput;

    @FindBy(xpath= "//input[@name='payee.address.city']")
    public WebElement cityInput;

    @FindBy(xpath= "//input[@name='payee.address.state']")
    public WebElement stateInput;

    @FindBy(xpath= "//input[@name='payee.address.zipCode']")
    public WebElement zipCodeInput;

    @FindBy(xpath= "//input[@name='payee.phoneNumber']")
    public WebElement phoneNumberInput;

    @FindBy(xpath= "//input[@name='payee.accountNumber']")
    public WebElement accountNumberInput;

    @FindBy(xpath= "//input[@name='verifyAccount']")
    public WebElement verifyAccountInput;

    @FindBy(xpath= "//input[@name='amount']")
    public WebElement amountInput;

    @FindBy(xpath= " //input[@ value ='Send Payment']")
    public WebElement sendPaymentButton;

    @FindBy(xpath= " //h1[text()='Bill Payment Complete']")
    public WebElement billPaymentCompleteText ;

    @FindBy(xpath= " //span[@id='amount']")
    public WebElement amountText ;

    @FindBy(xpath= "//span[@id='fromAccountId']")
    public WebElement accountNumberText ;

    @FindBy(xpath= "//a[text()='13899']")
    public WebElement  accountNumber;

    @FindBy(linkText= "Accounts Overview")
    public WebElement accountOverviewButton;

    @FindBy(xpath= "//td[text()='10-25-2024']")
    public WebElement paymentDate;

    @FindBy(xpath= "//*[@id=\"transactionTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement paymentName;

    @FindBy(xpath= "//*[@id=\"transactionTable\"]/tbody/tr[1]/td[3]")
    public WebElement paymentAmount;


}























































