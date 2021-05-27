package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
		   
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.amazon.in/");
		    
		    driver.manage().window().maximize(); //maximize		    
		   
		    driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).sendKeys("Books");
		    driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Da vinci code");
		    driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		    String title = driver.getTitle();		    
		    if(title.contains("Da vinci code")) {
		        System.out.println("Title has expected : " + title);
		    }else {
		        System.out.println("Title has not expected : " + title);
		    }
		    driver.close();
		    }
	
}

