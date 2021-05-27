package com.qa.Google;


	import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	public class GooglePage {


	    WebDriver driver;
	    
	    @FindBy(name="q")
	    WebElement SerachField; 

	    @FindBy(name = "btnk")
	    WebElement btnGloogleSearch;  
	        
	  
	    @FindAll(@FindBy(className="sbtc"))
	    List<WebElement> ItemNames;
	    
	    @FindBy(xpath="//input[@value='Google Search']")
	    WebElement Searchbutton;
	    
	    public void setSearchBoxSubmit() {
	    	Searchbutton.submit();
	    	}

	    public  WebElement setSearchData() {
	    	return SerachField;
	    	
	    }
	    
	    
	   
	  
		public WebElement GloogalClick() {
	    	return btnGloogleSearch;
	    }
		
		public List<WebElement> getItemNames(){
	        return ItemNames;
	    }
	    
	    public GooglePage(WebDriver rdriver) {
	        
	        this.driver = rdriver;
	        PageFactory.initElements(rdriver, this);
	        
	    }

	}