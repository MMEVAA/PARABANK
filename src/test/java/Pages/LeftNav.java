package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav(){

        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement UpdateContactInfo;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameHomePage;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordHomePage;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement LogIn;






















































}
