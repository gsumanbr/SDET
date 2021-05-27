package SeleniumAssignments.SeleniumAssignments;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class xpathSelector_TestCase15 {

	public static Properties prop; 
	public static FileInputStream fileLoc;
	WebDriver driver;

	@BeforeTest()
	public void BrowserOpen() throws InterruptedException {
		try {
			fileLoc = new FileInputStream(System.getProperty("user.dir")+"\\ExecutionProperties\\Config.properties");
			prop = new Properties();
			prop.load(fileLoc);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("Url"));
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}
	@Test(priority=1)
	public void Login() throws InterruptedException {

		String  Name = prop.getProperty("username");
		String  Psword = prop.getProperty("passwd");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2,dependsOnMethods= {"Login"})
	public void XPATh() throws InterruptedException
	{
		String text;
		Boolean ObjectExist;
		ObjectExist= driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		text=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).getText();
		Reporter.log("Admin Tab text is displaying as:'" + text +"'", true);
		
		Thread.sleep(3000);
		ObjectExist= driver.findElement(By.xpath("//input[@id='MP_link']")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		text=driver.findElement(By.xpath("//input[@id='MP_link']")).getAttribute("value");
		Reporter.log("Market Place text is displaying as :'" + text +"'", true);
		
		Thread.sleep(3000);	
		ObjectExist= driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		text=driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		Reporter.log("Welcome Admin text is displaying as :'" + text +"'", true);
		
		Thread.sleep(3000);
		ObjectExist= driver.findElement(By.xpath("//span[text()='Leave List']/parent::a/parent::div")).isDisplayed();
		Assert.assertTrue(ObjectExist);
		text=driver.findElement(By.xpath("//span[text()='Leave List']/parent::a/parent::div")).getText();
		Reporter.log("Leaves List text is displaying as :'" + text +"'", true);
	}
	
	@AfterTest()
	public void signoff()
	{
		driver.quit();
	}
}

