package ge.automation.tests;

import ge.automation.BaseTest;
import ge.automation.pages.InventoryPage;
import ge.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {



    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);

        // ავტორიზაცია - უზერი და პაროლით
        loginPage.login("standard_user", "secret_sauce");


        // ვამოწმებთ მიმდინარე ბმული ემთხვევა თუ არ მოსალოდნელს
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL არ ემთხვევა");


        // ჰედერის ტექსტის შემოწმება
        InventoryPage inventoryPage = new InventoryPage(driver);
        String expectedHeaderText = "Products";
        String actualHeaderText = inventoryPage.getInventoryHeaderText();
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "ტექსტი არ ემთხვევა");

    }

    @Test
    public void testLoginButtonTextColor() {
        LoginPage loginPage = new LoginPage(driver);
        String expectedColor = "rgba(19, 35, 34, 0.9)";
        String actualColor = loginPage.getLoginButtonTextColor();
        Assert.assertEquals(actualColor, expectedColor, "ფერი არ ემთხვევა");

    }










}
