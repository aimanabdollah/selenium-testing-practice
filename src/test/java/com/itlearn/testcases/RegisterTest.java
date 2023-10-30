package com.itlearn.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.itlearn.pageobject.BaseTest;
import com.itlearn.pageobject.RegisterPage;

public class RegisterTest extends BaseTest {

    // Test case to verify register
    @Test(priority = 1)
    public void verifyRegister() throws IOException {
        try {
            // Initialize the RegisterPage object
            RegisterPage lp = new RegisterPage(driver);

            // Test data
            String name = "Hamid bin Ali";
            String nama_panggilan = "Hamid";
            String email = "Hamid@gmail.com";
            String password = "abc12345";
            String password_confirm = "abc12345";

            // Perform register
            lp.loginToPortal(name, nama_panggilan, email, password, password_confirm);
            
            // Verify the success alert
            WebElement successAlert = driver.findElement(By.cssSelector(".alert.alert-success"));
            Assert.assertTrue(successAlert.isDisplayed(), "Registration success alert is not displayed.");
    
        } catch (Exception e) {
            // Print exception details
            e.printStackTrace();
            Assert.fail("Register test encountered an exception.");
        }
    }
}
