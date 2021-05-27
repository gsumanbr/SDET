package SeleniumAssignments.SeleniumAssignments;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class readheading_TestCase10 {
static Properties prop;
	public static void main(String[] args) throws InterruptedException  {
		String PropertiesFileLoc ="C:\\Users\\sukhavasis\\workspace\\SeleniumAssignments\\src\\main\\java\\SeleniumAssignments\\SeleniumAssignments\\test data\\OrageHRP.properties";
		try 
		{
			FileInputStream fileLoc = new FileInputStream(PropertiesFileLoc);
			prop = new Properties();
			prop.load(fileLoc);
		}
		catch (IOException ie)
		{
			System.out.println(ie.toString());
		}
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		try {
			String  Name = prop.getProperty("username");
			String  Psword = prop.getProperty("password");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("Dashboard")).click();
			String reqtext = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();
			System.out.println(reqtext);
		}

		catch(Exception e){
			System.out.println(e.toString());
		}
		
		driver.quit();
	}

}
