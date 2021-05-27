package com.qa.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenPopUp {	    
	    @Test
	    public void WorkingWithHiddenPopup() throws InterruptedException {
	        
	    	System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.cleartrip.com/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("DepartDate")).click(); // hidden pop generates...       
	        
	        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/a[1]")).click();
	        Thread.sleep(3000);
	        
	    }

	}