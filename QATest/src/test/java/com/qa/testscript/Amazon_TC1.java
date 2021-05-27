package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.AmazonPages.AmazonPages;

public class Amazon_TC1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AmazonPages AmazonOR = new AmazonPages(driver);
        driver.get("https://www.amazon.in/");

        AmazonOR.setCategoryInput("Appliances");
        AmazonOR.setSearchTextBoxInput("Fans");
        AmazonOR.setMagnifierBtnClick();
        System.out.println(driver.getTitle());
        
        List<WebElement> itemNames = AmazonOR.getItemNames();
        System.out.println(itemNames.size());
        for(WebElement ele:itemNames) {
            System.out.println(ele.getText());
        }
        driver.close();
    }

}

