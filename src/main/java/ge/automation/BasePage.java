package ge.automation;

import ge.automation.utils.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    public void enterText(WebElement locator, String text) {
        waitForElementToBeClickable(locator);
        Utils.log("გავაგზავნოთ ინფორმაცია [ " + text + " ]  ელემენტში: " + locator);
        locator.sendKeys(text);

    }


    public void clickToElement(WebElement locator) {
        Utils.log("click to element: " + locator); // ლოგირება
        locator.click();
    }

    public void clickToElementWithWait(WebElement locator) {
        waitForElementToBeClickable(locator);
        locator.click();
    }

    public void waitForElementToBeClickable(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public String getElementText(WebElement locator) {
        waitForElementToBeVisible(locator);
        return locator.getText();
    }


    public void waitForElementToBeVisible(WebElement locator) {
        wait.until(ExpectedConditions.visibilityOf(locator));
    }


    public String getCssValue(WebElement locator, String propertyName) {
        waitForElementToBeVisible(locator);
        return locator.getCssValue(propertyName);
    }

}
