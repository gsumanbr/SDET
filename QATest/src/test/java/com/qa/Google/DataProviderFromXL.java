package com.qa.Google;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utilities.excelUtility;

public class DataProviderFromXL extends BaseTest{

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
	        //Thread.sleep(2000);
		   // GoogleOR.setSearchData().clear();
	}
	
	


@DataProvider
public String[][] getData() throws IOException{
	
	// excel file path
	String xlpath = "C:\\Suman\\TestData\\InputData.xlsx";
	// sheet
	String xlSheet = "Sheet2";
	int rowCount = excelUtility.getRowCount(xlpath, xlSheet);
	
	int cellCount = excelUtility.getCellCount(xlpath, xlSheet, rowCount);	
	
	
	String[][] data = new String[rowCount][cellCount];		
	
	for(int i=1; i<=rowCount; i++) {
		
		for(int j=0; j<cellCount; j++) {
			data[i-1][j] = excelUtility.getCellData(xlpath, xlSheet, i, j);; //1,0
		}
	}
	
	return data;
}
}