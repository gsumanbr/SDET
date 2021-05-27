package com.qa.testscript;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.AmazonPages.AmazonPages;


public class ValidateAmazonCustomReport {
    
    
    WebDriver driver;
    AmazonPages AmazonOR;
    ExtentHtmlReporter HtmlReport;
    ExtentTest test;
    ExtentReports report;
    
    
    
    @BeforeClass
    public void setUp() {
        
        HtmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/myReport.html");
        HtmlReport.config().setDocumentTitle("Test Automation Report");
        HtmlReport.config().setReportName("Functional Test Report");
        HtmlReport.config().setTheme(Theme.DARK);
        HtmlReport.config().setAutoCreateRelativePathMedia(true);
        
        
        report = new ExtentReports();
        report.attachReporter(HtmlReport);
        report.setSystemInfo("Browser", "Chrome");
        report.setSystemInfo("QA Name", "Suman");
        
        
        
        
    }
    @AfterClass
    public void tearDown() {
        
        
        report.flush();
    }
    
    @BeforeMethod
    public void PreTest() {
    	System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        AmazonOR =  new AmazonPages(driver);       
        driver.get("https://www.amazon.in/");
        
    }
    
    @AfterMethod
    public void getStatus(ITestResult res) throws IOException {
        
        
        if(res.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Passed is :" + res.getName());
        }else if(res.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Failed is :" + res.getName());
            test.log(Status.FAIL, "Test Failed is :" + res.getThrowable());
            
            String SShotPath = ValidateAmazonCustomReport.getScreenshot(driver, res.getName());
            test.addScreenCaptureFromPath(SShotPath);

        }else if(res.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Skipped is :" + res.getName());
            test.log(Status.FAIL, "Test Skipped is :" + res.getThrowable());
        }
        
        driver.quit();  
        
    }

    
    @Test(priority=1)
    public void searchItem() {
        
        test = report.createTest("searchItem");
        
        AmazonOR.setCategoryInput("Books");
        AmazonOR.setSearchTextBoxInput("Da vinci code");
        AmazonOR.setMagnifierBtnClick();
        
        Assert.assertTrue(driver.getTitle().contains("Da vinci code"));
        
    }
    
    @Test(priority=2)
    public void footerLinks() {
        test = report.createTest("footerLinks");
        List<WebElement> footerLinks = AmazonOR.getFooterLinks();
        Assert.assertTrue(footerLinks.size()<50);
        
    }
    
    
    
    public static String getScreenshot(WebDriver driver, String Screenshotname) throws IOException {
        
        
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        
        TakesScreenshot Ts = (TakesScreenshot)driver;
        File Source = Ts.getScreenshotAs(OutputType.FILE);
        
        String Destination = System.getProperty("user.dir") + "/Screenshots/" + Screenshotname + dateName +".png";
        
        FileUtils.copyFile(Source, new File(Destination));
        
        
        return Destination;
    }
    
    
}