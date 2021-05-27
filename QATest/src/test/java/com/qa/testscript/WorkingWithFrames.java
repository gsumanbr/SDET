package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithFrames {
    
    
//  // By index
//  By name
//  Element
    
    @Test
    public void frameByIndex() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://docs.oracle.com/javase/7/docs/api/");
        
        List<WebElement> Frames = driver.findElements(By.tagName("frame"));
        
        for(int i=0;i< Frames.size();i++) {
            
            WebDriver frame = driver.switchTo().frame(i);
            
            List<WebElement> allLinks = frame.findElements(By.tagName("a"));
            System.out.println("Total no. of links present on the frame " + i +" are : " + allLinks.size());
           /* for(WebElement link:allLinks) {
                Reporter.log(link.getText(),true);
            }
            */
            driver.switchTo().defaultContent();
        }
        
        driver.close();
        
    }
    
    
    
    
    
    

}
