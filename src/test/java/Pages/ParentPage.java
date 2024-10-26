package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.beust.jcommander.DefaultUsageFormatter.s;

public class ParentPage {

    public WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void mySendKeys(WebElement element,String yazi){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrolltoElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrolltoElement(element);
        element.click();
    }

    public void scrolltoElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void LoginContainsText(WebElement element,String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
    }



    public void verifyMessageContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()) );
    }



    public void javaScripClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void mySelecTtext(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrolltoElement(element);
        Select selectElement=new Select(element);
        selectElement.selectByVisibleText(text);
    }

    public void mySelecIndex(WebElement element, int index) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select selectElement = new Select(element);
        selectElement.selectByIndex(index);

    }














































}
