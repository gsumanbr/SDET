package com.qa.DemoGuru;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utilities.excelUtility;

public class Register extends BaseTest{
	
	@Test(dataProvider="getData")
	public void Registration(String FirstName,String LastName,String Phonenumber,String Email) throws InterruptedException {
		driver.manage().window().maximize();
		DemoGuruOR.ClickOnRegister();
		Thread.sleep(2000);		
		DemoGuruOR.FirstName.sendKeys(FirstName);
		DemoGuruOR.LastName.sendKeys(LastName);
		DemoGuruOR.Phone.sendKeys(Phonenumber);
		DemoGuruOR.Email.sendKeys(Email);
	}


	

	






	@DataProvider
	public String[][] getData() throws IOException{
		
		// excel file path
		String xlpath = "C:\\Suman\\TestData\\InputData.xlsx";
		// sheet
		String xlSheet = "Sheet3";
		int rowCount = excelUtility.getRowCount(xlpath, xlSheet);
		
		int cellCount = excelUtility.getCellCount(xlpath, xlSheet, rowCount);	
		
		
		String[][] data = new String[rowCount][cellCount];		
		
		for(int i=1; i<=rowCount; i++) {
			
			for(int j=0; j<cellCount; j++) {
				data[i-1][j] = excelUtility.getCellData(xlpath, xlSheet, i, j);; //1,0
				System.out.println(data[i-1][j]);
			}
		}
		
		return data;
	}
}
