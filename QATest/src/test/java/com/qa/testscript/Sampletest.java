package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.AmazonPages.RediffPages;


public class Sampletest {	

 @Test 
 
	public void Smaple() {

		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        RediffPages RediffOR = new RediffPages(driver);
        driver.get("https://www.rediff.com/");

        boolean createAccoutLinkEnabled = RediffOR.getCreateAccoutLinkEnabled();

        if(createAccoutLinkEnabled) {
            RediffOR.setCreateAccoutLinkClick();
            if(driver.getCurrentUrl().contains("register")) {
                System.out.println("User is landed on the registration page");
            }
                else
                { System.out.println("User is notlanded on the registration page");
                             
        }
           //Thread.sleep(2000);
            System.out.println("Number Of hyper links " + RediffOR.getlinks());
	         
          
	    }
	}
}


		

