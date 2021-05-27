package com.qa.recap;

import java.io.IOException;

import org.testng.annotations.Test;

public class OpenSourcesDemo extends BaseTest {

	
	@Test
	public void login() throws IOException,InterruptedException {
		
		Thread.sleep(2000);
		String Uname = Prop.getProperty("User");			
		String Password =Prop.getProperty("Password");			
		RediffOR.getUserName().sendKeys(Uname);
		RediffOR.getPassword().sendKeys(Password);		
		RediffOR.ClickLogin().click();
		String title = driver.getTitle();		    
	    if(title.contains("orangehrmlive")) {
	        System.out.println("Title has expected : " + title);
	    }else {
	        System.out.println("Title has not expected : " + title);
	    }
		
		
	}
	
	}

