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


}























































