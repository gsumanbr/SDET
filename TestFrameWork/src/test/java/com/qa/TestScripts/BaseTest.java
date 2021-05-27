package com.qa.TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.ParaBankPages.FundTransferPage;
import com.qa.ParaBankPages.LoginPage;



public class BaseTest {
	WebDriver driver;
	LoginPage LoginOR;
	FundTransferPage FundTransferOR;
	FileInputStream Fileloc;
	Properties Prop;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url) throws IOException, InterruptedException {
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\soft\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","path of geckodriver.exe");
			driver = new FirefoxDriver();

		}else if(Browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\soft\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		
		LoginOR  = new LoginPage(driver);
		FundTransferOR  = new FundTransferPage(driver);
		
		//driver.get("https://www.rediff.com/");
		driver.get(Url);
		//Re
		Fileloc = new FileInputStream("C:\\Suman\\TestFrameWork\\src\\test\\java\\com\\qa\\testdata\\InputData.properties");
        Prop = new Properties();        
        Prop.load(Fileloc);        
        driver.manage().window().maximize();
        //Reading UserName
		String Uname = Prop.getProperty("UserName");
		//Reading Password
		String Pwrd = Prop.getProperty("password");
		//Enter UserName
		LoginOR.setUserName(Uname);		
		//Enter Password
		LoginOR.setPassword(Pwrd);		
		//Click on Login
		LoginOR.ClickOnLogin();
		Thread.sleep(2000);
		String urlname = driver.getCurrentUrl();        
        if (urlname.contains("overview")){        	
        	Assert.assertTrue(true);
        }else {        	
        	Assert.assertTrue(false);
        }
      
    	}
	
	
	/* public void Login() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String Uname = Prop.getProperty("UserName");
		Thread.sleep(2000);
		String Pwrd = Prop.getProperty("password");	
		Thread.sleep(2000);
		LoginOR.setUserName(Uname);		
		LoginOR.setPassword(Pwrd);
		Thread.sleep(2000);
		LoginOR.ClickOnLogin();
	}*/
	
	@AfterClass
	public void tearDown() {
		// close the browser
		//driver.close();
		driver.quit();
	}
	
	
	
	 public void  getScreenshot(WebDriver driver, String TestName) throws IOException {	        
	        
	        //String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        
	        TakesScreenshot Ts = (TakesScreenshot)driver;
	        File Source = Ts.getScreenshotAs(OutputType.FILE);
	        
	        String Destination = System.getProperty("user.dir") + "/Screenshots/" + TestName  +".png";
	        
	        FileUtils.copyFile(Source, new File(Destination));	        
	        
	  
	    }
	    
}
