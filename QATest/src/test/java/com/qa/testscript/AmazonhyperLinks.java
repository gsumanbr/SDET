package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonhyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().window().maximize(); //maximize	
	    
        
        List <WebElement> links = driver.findElements(By.xpath("//*[contains(@class,'nav')]"));
        System.out.println("Total no. of links are :" + links.size()); // count of items

        for(WebElement link:links) {
            System.out.println("The name of the links  : " + link.getText());
        }
        driver.close();
	}
	
	
}

