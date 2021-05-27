package com.qa.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollByElementPresence {
    
    
    @Test
    public void scrollByElement() throws InterruptedException {
        
    	 System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        JavascriptExecutor Js = (JavascriptExecutor) driver;
                
        WebElement ele = driver.findElement(By.linkText("Careers"));
        
        Js.executeScript("arguments[0].scrollIntoView()",ele);
        Thread.sleep(3000);
        
        ele.click();
        
        boolean contains = driver.getCurrentUrl().contains("jobs");
        Assert.assertTrue(contains);
        
        driver.quit();
        
        
        
    }
    
    

}
