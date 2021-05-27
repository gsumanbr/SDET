package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.AmazonPages.AmazonPages;

public class DataPro {

	 @Test(dataProvider="getData")
	public void main(String category, String itemName) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        AmazonPages AmazonOR = new AmazonPages(driver);
        driver.get("https://www.amazon.in/");

        AmazonOR.setCategoryInput(category);
        Thread.sleep(2000);
        AmazonOR.setSearchTextBoxInput(itemName);
        Thread.sleep(2000);
        AmazonOR.setMagnifierBtnClick();
        System.out.println(driver.getTitle());
        
        List<WebElement> itemNames = AmazonOR.getItemNames();
        System.out.println(itemNames.size());
        for(WebElement ele:itemNames) {
            System.out.println(ele.getText());
        }
        driver.close();
    }






@DataProvider
public Object[][] getData(){
    Object[][] data = new Object[3][2];
    // category
    data[0][0] = "Books";
    data[1][0] = "Electronics";
    data[2][0] = "Appliances";
    
    
    // search item
    
    data[0][1] = "Da vinci code";
    data[1][1] = "Mobile phones";
    data[2][1] = "table fans";
    
    return data;
    
}

}



