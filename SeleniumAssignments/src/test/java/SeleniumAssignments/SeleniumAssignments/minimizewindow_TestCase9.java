package SeleniumAssignments.SeleniumAssignments;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class minimizewindow_TestCase9 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(0, -1000));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.close();
	}


}
