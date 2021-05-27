package com.qa.testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExampleforDragandDrop {
    
    @Test
    public void dragAnddrop() throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        
        WebElement targetEle = driver.findElement(By.id("draggable"));
        
        WebElement dropEle = driver.findElement(By.id("droppable"));
        
        
        Actions act = new Actions(driver);
        //act.clickAndHold(targetEle).moveToElement(dropEle).build().perform();
        
        act.dragAndDrop(targetEle, dropEle).build().perform();
        Thread.sleep(3000);
        
        driver.close();
        
    }  
}
