package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
		   
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.amazon.in/");
		    
		    driver.manage().window().maximize(); //maximize
		    
		    String title = driver.getTitle();
		    System.out.println(title);
		    if(title.contains(title.toUpperCase()))
		    {
		    	 System.out.println("Title is in uppercase");
		    }
		    else
		    {
		    	System.out.println("Title is not in uppercase");	
		    }
		   
		    		driver.close();
	}
}

	