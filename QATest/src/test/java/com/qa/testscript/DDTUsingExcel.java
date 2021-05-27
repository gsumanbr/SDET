package com.qa.testscript;



	import java.io.FileInputStream;	
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

import com.qa.AmazonPages.AmazonPages;
	
	public class DDTUsingExcel {
	    
	    @Test
	    public void AmazonMultipleInput() throws IOException {
	        
	        FileInputStream FileLoc = new FileInputStream("C:\\Suman\\TestData\\InputData.xlsx");
	        XSSFWorkbook WorkBook = new XSSFWorkbook(FileLoc);
	        
	        XSSFSheet WSheet = WorkBook.getSheet("Sheet1");
	        
	        int lastRowNum = WSheet.getLastRowNum();
	        
	        for(int i=1 ; i<=lastRowNum ; i++) {
	            XSSFRow row = WSheet.getRow(i);
	            String Category = row.getCell(0).getStringCellValue();
	            String ItemName = row.getCell(1).getStringCellValue();
	            
	            System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            AmazonPages AmazonOR = new AmazonPages(driver);     
	            
	            driver.get("https://www.amazon.in/");
	            
	            AmazonOR.setCategoryInput(Category);
	            AmazonOR.setSearchTextBoxInput(ItemName);
	            AmazonOR.setMagnifierBtnClick();
	            
	            boolean contains = driver.getTitle().contains(ItemName);
	            Assert.assertTrue(contains);
	            Reporter.log(driver.getTitle(),true);
	            driver.quit();
	            WorkBook.close();
	            FileLoc.close();
	            
	        }
	        
	        
	        
	        
	    }
	    
}
