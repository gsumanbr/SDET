package com.qa.ParaBankPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {
	
	WebDriver driver;
	//a[contains(text(),'Transfer Funds')]
	
	@FindBy(xpath="//a[contains(text(),'Transfer Funds')]")
    WebElement TransferFunds;
	
	public void ClickOnTransFerFunds() {
		TransferFunds.click();
	}
	public FundTransferPage(WebDriver driver) {	    
	    this.driver = driver;
	    PageFactory.initElements(driver, this);   
    }
}