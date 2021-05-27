package com.qa.ParaBankPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name="username")
    WebElement Username;
    
    @FindBy(name="password")
    WebElement Password;
    
    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    WebElement Login ;
    
    public void setUserName(String input) {
    	Username.sendKeys(input);
    }
    public void setPassword(String input) {
    	Password.sendKeys(input);
    }

    // click the button

    public void ClickOnLogin() {
    	Login.click();
    }

    
    public LoginPage(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);   
}
}