package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



public class GuruDemoSite {
	 @Test
	    public void Flight() throws InterruptedException {
	        
	    	System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/newtours/");
	        driver.manage().window().maximize();   
	      
	        driver.findElement(By.name("userName")).sendKeys("mercury");  
	        driver.findElement(By.name("password")).sendKeys("mercury");
	        driver.findElement(By.name("submit")).click();  
	      
	        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
	        driver.findElement(By.name("passCount")).click();
	    }

	}

