package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
		   
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.amazon.in/");
		    
		    driver.manage().window().maximize(); //maximize
		    
		    String title = driver.getTitle();
		    
		    if(title.contains("Amazon")) {
		        System.out.println("Title has amazon keyword : " + title);
		    }else {
		        System.out.println("Title do not have amazon keyword : " + title);
		    }
		    
		    driver.close();
		}
		
	}


