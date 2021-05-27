package com.qa.DemoGuru;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Login extends BaseTest{
  
	public void LoginDemo() throws InterruptedException, IOException {
		// TODO Auto-generated method stub	
	Thread.sleep(2000);
	String userName = Prop.getProperty("DemoGuruUserName");			
	String password =Prop.getProperty("DemoGuruPassword");	
	//user name
	DemoGuruOR.userName.sendKeys(userName);
	//password
	DemoGuruOR.password.sendKeys(password);
	//clicking
	DemoGuruOR.ClickOnLogin();
	Thread.sleep(2000);
	String currentUrl = driver.getCurrentUrl();
	if (currentUrl.contains("login_sucess")){
    	getScreenshot(driver,"LoginDemo");
    	Assert.assertTrue(true);
    }else {
    	getScreenshot(driver,"LoginDemo");
    	Assert.assertTrue(false);
    }
	DemoGuruOR.ClickOnFlights();
	Thread.sleep(2000);
	String FromPlace = DemoGuruOR.getDeptFrom();
	String TOPlace = DemoGuruOR.getArriving();
	System.out.println("Departing From "+FromPlace);
	System.out.println("Arriving In "+TOPlace);
	
	}
}
