package com.qa.testscript;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingwithScrollsBars {

    // JavaScriptExecutor interface used to perform Javascript actions on the browser..
    
    
    // Scroll up & down if the page has vertical
    
    // Slide from right to left vice versa if the page has horizontal scroll bars..
    
    @Test
    public void scrollBars() throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        JavascriptExecutor Js = (JavascriptExecutor) driver;
//      Js.executeScript("window.scrollBy(x,y)")
//      
//      x--> Horizontal
//      y- > vertical
        for(int i=0; i<5; i++) {
            Js.executeScript("window.scrollBy(0,500)"); // top to bottom 500 co-ordinate positions
            Thread.sleep(2000);
        }
        
        for(int i=5; i>=1; i--) {
            Js.executeScript("window.scrollBy(0,-500)"); // top to bottom 500 co-ordinate positions
            Thread.sleep(2000);
        }
        
//      // Horizontal page
//      
//      for(int i=0; i<5; i++) {
//          Js.executeScript("window.scrollBy(500,0)"); // left to right 500 co-ordinate positions
//          Thread.sleep(2000);
//      }
//      
//      for(int i=5; i>=1; i--) {
//          Js.executeScript("window.scrollBy(-500,0)"); // right to left 500 co-ordinate positions
//          Thread.sleep(2000);
//      }
//      
    }
    
    
    
}
