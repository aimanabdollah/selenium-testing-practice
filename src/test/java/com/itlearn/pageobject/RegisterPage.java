package com.itlearn.pageobject;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseTest {
    WebDriver driver;

    // Constructor
    public RegisterPage(WebDriver lDriver) {
        this.driver = lDriver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//a[text()='di sini'][1]")
    WebElement registerLink;
    
    @FindBy(id = "name")
    WebElement inputNama;
    
    @FindBy(id = "nama_panggilan")
    WebElement inputNamaPanggilan;
    
    @FindBy(id = "email")
    WebElement inputEmail;
    
    @FindBy(id = "password")
    WebElement inputPass;
    
    @FindBy(id = "password-confirm")
    WebElement inputPassConfirm;
    
    @FindBy(className = "btn-primary")
    WebElement registerButton;

    // Login to the portal with email and password
    public void loginToPortal(String name, String nama_panggilan, String email, String password, String password_confirm) {
    	registerLink.click();
    	inputNama.sendKeys(name);
        inputNamaPanggilan.sendKeys(nama_panggilan);
    	inputEmail.sendKeys(email);
        inputPass.sendKeys(password);
    	inputPassConfirm.sendKeys(password_confirm);
        registerButton.click();
    }

}
