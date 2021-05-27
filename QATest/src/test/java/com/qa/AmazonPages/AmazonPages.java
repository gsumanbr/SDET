package com.qa.AmazonPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {

	
		// TODO Auto-generated method stub

		  // Create the reference variable to store the test object description
	    // Define the set of methods that can perform the user actions
	    // to redefine the scope of class member within this , create a constructor that can load the elements at the time of execution
		
	    WebDriver driver;

	    @FindBy(id="searchDropdownBox")
	    WebElement Category;


	    @FindBy(css="#twotabsearchtextbox")
	    WebElement SearchTextBox;


	    @FindBy(xpath="//input[@id='nav-search-submit-button']")
	    WebElement MagnifierBtn;
	    
	    @FindBy(xpath ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")
	    WebElement SuccessMess;
	    
	    
	    @FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	    List<WebElement> ItemNames;

	    // select a value
	    public void setCategoryInput(String input) {
	        Select sel = new Select(Category);      
	        sel.selectByVisibleText(input);
	    }

	    // type a value

	    public void setSearchTextBoxInput(String input) {
	        SearchTextBox.sendKeys(input);
	    }
	    public Object LoginMess() {
	        return SuccessMess;
	    }

	    // click the button

	    public void setMagnifierBtnClick() {
	        MagnifierBtn.click();
	    }

	    
	    public List<WebElement> getItemNames(){
	        return ItemNames;
	    }
	    
	    @FindBy(linkText="Start here.")
	    WebElement regLink;
	    
	    public WebElement getregLink() {
	        return regLink;
	    }
	    
	    
	    @FindBy(id="nav-link-accountList-nav-line-1")
	    WebElement AccountsandLists1;
	    
	    public WebElement getAccountsandLists1() {
	        return AccountsandLists;
	    }  
	    
	    public WebElement getregLink1() {
	        return regLink;
	    }
	    
	    
	    @FindBy(id="nav-link-accountList-nav-line-1")
	    WebElement AccountsandLists;
	    
	    public WebElement getAccountsandLists() {
	        return AccountsandLists;
	    }

	    
	    public AmazonPages(WebDriver driver) {
	        
	        this.driver = driver;
	        PageFactory.initElements(driver, this);     
	    

	}

		public List<WebElement> getFooterLinks() {
			// TODO Auto-generated method stub
			return null;
		}
}
