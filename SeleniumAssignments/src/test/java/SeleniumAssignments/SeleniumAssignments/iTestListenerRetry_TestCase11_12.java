package SeleniumAssignments.SeleniumAssignments;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.qa.pages.*;
public class iTestListenerRetry_TestCase11_12 extends TestBase
{
    public static WebDriver driver;
	OrangeHrpPages OrangeOR;
	public static FileInputStream fileLoc;
	public static Properties prop;
    @BeforeClass
	public void setUp() {

		try {
			fileLoc = new FileInputStream(System.getProperty("user.dir")+"\\ExecutionProperties\\Config.properties");
			prop = new Properties();
			prop.load(fileLoc);
		}catch(Exception e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
        }
	@Test(priority=1)
	public void LogInToApp() throws InterruptedException {
		String  Name = prop.getProperty("username");
		String  Psword = prop.getProperty("passwd");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
    @Test(priority=2 , retryAnalyzer=com.qa.Listener.RetryAnalyzer.class)
    public void method1() throws Exception
	{
        String DashBoardHeader = OrangeOR.GetDashBoardHeaderText();
		boolean res = DashBoardHeader.equalsIgnoreCase("Dashbard");
		if(res)
		{
			Thread.sleep(4000);
			captureScreenshot(driver,"DashBoard Passed");
			Assert.assertTrue(true); 
			Reporter.log("User is in Dashboard Menu", true);;
		}
		else
		{
			int i = 1; 
			captureScreenshot(driver,"DashBoard Failed Interation = "+ i);
			Assert.assertTrue(false); 
			Reporter.log("User is NOT in Dashboard Menu", true);
			i++;
		} 
	}
    @AfterSuite
	public void tearDown() {
		driver.quit();
	}


}
