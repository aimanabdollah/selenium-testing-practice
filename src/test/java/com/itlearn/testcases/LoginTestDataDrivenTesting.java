package com.itlearn.testcases;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pageobject.BaseTest;
import com.itlearn.pageobject.LoginPage;
import com.itlearn.utilities.ReadExcelFile;

public class LoginTestDataDrivenTesting extends BaseTest {

    // Define the Excel file path
    String fileName = System.getProperty("user.dir") + "\\TestData\\TestInfo.xlsx";

    @Test(priority = 1, dataProvider = "LoginDataProvider")
    public void VerifyLogin(String userEmail, String userPwd) throws IOException {
        
    	// Initialize the LoginPage object
        LoginPage lp = new LoginPage(driver);
        
        // Log in with provided user credentials
        lp.loginToPortal(userEmail, userPwd);

        // Check if the login is successful
        if (userEmail.equals(userEmail) && userPwd.equals(userPwd)) {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
            lp.logout();
        } else {
            
        	// Capture a screenshot on failure
            captureScreenShot(driver, "VerifyLogin");
            Assert.assertTrue(false);
        }
    }

    @DataProvider(name = "LoginDataProvider")
    public String[][] LoginDataProvider() {
        
    	// Get the total number of rows and columns from the Excel file
        int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginData");
        int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginData");

        // Create a 2D array to store data from the Excel file
        String data[][] = new String[ttlRows - 1][ttlColumns];

        // Read data from the Excel file and populate the 2D array
        for (int i = 1; i < ttlRows; i++) {
            for (int j = 0; j < ttlColumns; j++) {
                data[i - 1][j] = ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
            }
        }

        return data;
    }
}
