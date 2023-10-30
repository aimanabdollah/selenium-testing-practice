package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pageobject.BaseTest;
import com.itlearn.pageobject.LoginPage;
import com.itlearn.pageobject.SearchPage;
import com.itlearn.utilities.ReadExcelFile;

public class SearchTest extends BaseTest {
    
    // Define the path to the Excel file containing test data
    String fileName = System.getProperty("user.dir") + "\\TestData\\TestInfo.xlsx";

    // Test case to search for orphans
    @Test(priority = 1)
    void searchOrphanTest() {
        
    	// Initialize LoginPage object
        LoginPage lp = new LoginPage(driver);

        // Get email and password from Excel file
        String email = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
        String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);

        // Login to the portal
        lp.loginToPortal(email, password);

        // Initialize SearchPage object
        SearchPage sp = new SearchPage(driver);

        // Get the search query for orphans from Excel file
        String findOrphan = ReadExcelFile.getCellValue(fileName, "SearchOrphan", 0, 0);

        // Perform the search for orphans
        sp.searchOrphan(findOrphan);
    }
}
