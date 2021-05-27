package com.qa.recap;
	import java.io.IOException;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;





	public class TC_Rediff_04 extends BaseTest{
	    
	    @Test
	    public void WorkingWithPopUps() throws InterruptedException, IOException {
	        RediffOR.setCreateAccoutLinkClick();
	        String urlname = driver.getCurrentUrl();
	        
	        if (urlname.contains("register")){
	        	getScreenshot(driver,"WorkingWithPopUps");
	        	Assert.assertTrue(true);
	        }else {
	        	getScreenshot(driver,"WorkingWithPopUps");
	        	Assert.assertTrue(false);
	        }
	        
	        RediffOR.getFullNameTextField().sendKeys("12345");
	        RediffOR.getFullNameTextField().sendKeys(Keys.TAB);
	        
	        Thread.sleep(15000);
	        
	        Alert Jsalert = driver.switchTo().alert();
	        System.out.println(Jsalert.getText());
	        
	        Jsalert.accept();
	        RediffOR.getFullNameTextField().clear();
	        Thread.sleep(5000);
	        RediffOR.getFullNameTextField().sendKeys("sample");
	        Thread.sleep(5000);
	        RediffOR.getEmailIDTextField().sendKeys("test@test.com");
	        
	        
	    }

	}

