package com.itlearn.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
WebDriver driver;
	    
        //constructor
		public SearchPage(WebDriver lDriver)
		{
			this.driver=lDriver;	
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//a[@href='https://epjay-eul6p.ondigitalocean.app/admin-orphan']")
		WebElement navOrphan;
	   
		@FindBy(xpath = "//input[@type='search']")
		WebElement searchInput;
	
		@FindBy(css = "a.btn.btn-primary")
		WebElement viewButton;

		
		public void searchOrphan(String orphanID)
		{
			navOrphan.click();
			searchInput.sendKeys(orphanID);
			viewButton.click();
		}
}