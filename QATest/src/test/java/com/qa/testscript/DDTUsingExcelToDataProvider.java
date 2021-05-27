package com.qa.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utilities.excelUtility;

public class DDTUsingExcelToDataProvider extends TestBase{
	
	
	@Test(dataProvider="getData")
	public void searchItem(String category, String itemname) throws InterruptedException {	
		driver.manage().window().maximize();
		RediffOR.setCategoryInput(category);
		Thread.sleep(2000);
		RediffOR.setSearchTextBoxInput(itemname);
		RediffOR.setMagnifierBtnClick();
		
		String title = driver.getTitle();
		Reporter.log(title,true);			
		
	}
	
	@DataProvider
	public String[][] getData() throws IOException{
		
		// excel file path
		String xlpath = "C:\\Suman\\TestData\\InputData.xlsx";
		// sheet
		String xlSheet = "Sheet1";
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