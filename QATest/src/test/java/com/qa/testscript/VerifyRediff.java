package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
		   
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.rediff.com/");
	    
	    driver.manage().window().maximize(); //maximize
	    
	driver.findElement(By.partialLinkText("Create Account")).click();
	String title = driver.getTitle();
	 if(title.contains("register")) {
	        System.out.println("navigated to registration page");
	    }else {
	        System.out.println("failed to navigate registration page");
	    }
	 
	 
	 driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("smith");
	 driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("test.test");
	 driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td/input[2]")).click();
	 driver.close();
	}
}
	
	
