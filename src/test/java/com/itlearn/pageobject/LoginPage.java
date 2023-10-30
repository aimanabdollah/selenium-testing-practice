package com.itlearn.pageobject;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver lDriver) {
        this.driver = lDriver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(name = "email")
    WebElement inputEmail;

    @FindBy(name = "password")
    WebElement inputPass;

    @FindBy(className = "btn-primary")
    WebElement loginButton;

    @FindBy(partialLinkText = "Log Keluar")
    WebElement logoutclick;

    // Login to the portal with email and password
    public void loginToPortal(String email, String password) {
        inputEmail.sendKeys(email);
        inputPass.sendKeys(password);
        loginButton.click();
    }

    // Logout from the portal
    public void logout() {
        logoutclick.click();
    }

    // Validate the dashboard page
    public void dashboardportal(String dash) throws IOException {
        String actualdash = driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
        System.out.println(actualdash);

        if (actualdash.equals(dash)) {
            System.out.println("Test Passed");
        } else {
            captureScreenShot(driver, "fetchDashboardText");
        }
        assertEquals(dash, actualdash);
    }
}
