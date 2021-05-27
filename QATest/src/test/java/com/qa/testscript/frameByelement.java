package com.qa.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class frameByelement {
	@Test
	    public void frameByelement1() throws InterruptedException {
	        
	        
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://docs.oracle.com/javase/7/docs/api/");
	        Thread.sleep(4000);
	        
	        WebElement ele = driver.findElement(By.xpath("//*[@title='All Packages']"));
	        
	        String attribute = ele.getAttribute("name");
//	      WebDriver frame = driver.switchTo().frame(ele);
//	      System.out.println(frame.findElement(By.linkText("java.awt")).getAttribute("href"));
//	      frame.findElement(By.linkText("java.awt")).click();
//	      Thread.sleep(5000);
//	      
	        
	        WebDriver frame = driver.switchTo().frame(attribute);
	        System.out.println(frame.findElement(By.linkText("java.awt")).getAttribute("href"));
	        frame.findElement(By.linkText("java.awt")).click();
	        Thread.sleep(5000);
//	      
	        
	        driver.quit();
	    }     
	 
	    
	    

	}


