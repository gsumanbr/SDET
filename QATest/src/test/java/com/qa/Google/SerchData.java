package com.qa.Google;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SerchData extends BaseTest{


	 @Test(dataProvider="getData")
	public void search(String SerchData) throws InterruptedException {	
		 driver.manage().window().maximize();
		 	GoogleOR.setSearchData().clear(); 
		 	GoogleOR.setSearchData().sendKeys(SerchData);
			Thread.sleep(2000); 		    
		    
		    List<WebElement> itemNames = GoogleOR.getItemNames();
	        System.out.println("Number of prepapulated search items for search data "+SerchData + itemNames.size());
	        for(WebElement ele:itemNames) {
	            System.out.println(ele.getText());
	        }
	       
	        GoogleOR.setSearchData().submit();
	        String title = driver.getTitle();
			Reporter.log(title,true);
	}
	
	





@DataProvider
public Object[][] getData(){
    Object[][] data = new Object[3][1];
    // category
    data[0][0] = "Automation testing";
    data[1][0] = "performance testing";
    data[2][0] = "Manual Testing";
    
    
    // search item
    
    //data[0][1] = "Da vinci code";
   // data[1][1] = "Mobile phones";
   // data[2][1] = "table fans";
    
    return data;
    
}

}
