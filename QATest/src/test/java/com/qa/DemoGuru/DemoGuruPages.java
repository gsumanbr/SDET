package com.qa.DemoGuru;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoGuruPages {

    WebDriver driver;
    
    @FindBy(name="userName")
    WebElement userName; 
    
    @FindBy(name="password")
    WebElement password; 

    @FindBy(name = "submit")
    WebElement loginbtn; 
    
    @FindBy(xpath = "//a[contains(text(),'Flights')]")
    WebElement flights; 
    
    @FindBy(name = "fromPort")
    WebElement DepartingFrom; 
    
    @FindBy(name = "toPort")
    WebElement ArrivingIn;     
  
    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
    WebElement Register; 
    
    @FindBy(name = "firstName")
    WebElement FirstName; 
    
    @FindBy(name = "lastName")
    WebElement LastName; 
    
    @FindBy(name = "phone")
    WebElement Phone; 
    
    @FindBy(name = "userName")
    WebElement Email; 
    
   public  WebElement setFirtsName() {
  	return FirstName;    	
  }
   public  WebElement setLastName() {
	  	return LastName;    	
	  }
   public  WebElement setPhoneNumber() {
	  	return Phone;    	
	  }
   public  WebElement setEmail() {
	  	return FirstName;    	
	  }
    public  WebElement setUserName() {
    	return Email;    	
    }
    public  void ClickOnRegister() {
    	 Register.click();    	
    }
    
    public  WebElement setPassword() {
    	return password;    	
    }
    
    public void ClickOnLogin() {
    	 loginbtn.click();
    }
   
    public void ClickOnFlights() {
    	flights.click();
    }
    
    public String getDeptFrom() {
    	return DepartingFrom.getText() ;   
    }
    
    public String getArriving() {
    	return ArrivingIn.getText();
    }
    
    public WebElement DeptFrom() {
    	return DepartingFrom;
    } 
    public WebElement Arriving() {
    	return ArrivingIn;
    } 
    
       public DemoGuruPages(WebDriver rdriver) {        
        this.driver = rdriver;
        PageFactory.initElements(rdriver, this);
        
    }

}

