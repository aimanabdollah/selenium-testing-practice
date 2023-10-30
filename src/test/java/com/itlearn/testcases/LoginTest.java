package com.itlearn.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.itlearn.pageobject.BaseTest;
import com.itlearn.pageobject.LoginPage;

public class LoginTest extends BaseTest {

    // Test case to verify login 
    @Test(priority = 1)
    public void verifyLoginAdmin() throws IOException {
        try {
            // Initialize the LoginPage object
            LoginPage lp = new LoginPage(driver);

            // Test data
            String email = "admin@gmail.com";
            String password = "abc12345";

            // Perform login
            lp.loginToPortal(email, password);

            // Validate login result
            String expectedURL = "https://epjay-eul6p.ondigitalocean.app/admin-home";
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals(actualURL, expectedURL, "Login failed.");
            
        } catch (Exception e) {
            // Print exception details
            e.printStackTrace();
            Assert.fail("Login test encountered an exception.");
        }
    }
}
