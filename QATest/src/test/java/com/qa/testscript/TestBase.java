package com.qa.testscript;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.AmazonPages.RediffPages;

public class TestBase {

	WebDriver driver;
	RediffPages RediffOR;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url) {
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
		
		RediffOR = new RediffPages(driver);
		
		//driver.get("https://www.rediff.com/");
		driver.get(Url);
	}
	
	@AfterClass
	public void tearDown() {
		// close the browser
		//driver.close();
		driver.quit();
	}
	
}
	
