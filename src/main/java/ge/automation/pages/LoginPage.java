package ge.automation.pages;

import ge.automation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");




    public void login(String username, String password) {
        // ცუდი არ არის

 //       driver.findElement(usernameField).sendKeys(username);
//        driver.findElement(passwordField).sendKeys(password);
//        driver.findElement(loginButton).click();

        // კარგი მიდგომა
        enterText(usernameField,username);
        enterText(passwordField, password);
        clickToElementWithWait(loginButton);
    }



    public String getLoginButtonTextColor() {
        return getCssValue(loginButton, "color");
    }



}
