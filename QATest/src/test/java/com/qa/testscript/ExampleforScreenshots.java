package com.qa.testscript;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;







public class ExampleforScreenshots extends TestBase{
    
	   @Test
	    public void getAmazonLogoImage() {
	        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	        
	        File source = RediffOR.getamazonLogo().getScreenshotAs(OutputType.FILE);
	        String Destination = System.getProperty("user.dir") + "/Screenshots/" + "Amazon Logo" + dateName +".png";
	        
	        try {
	            FileUtils.copyFile(source, new File(Destination));
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	        }
	        
	    }
	    
	    
	
	}



/*@Test
public void driverScreenshot() {
    
    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    
    TakesScreenshot Ts = (TakesScreenshot)driver;
    File Source = Ts.getScreenshotAs(OutputType.FILE);
    
    String Destination = System.getProperty("user.dir") + "/Screenshots/" + "Amazon Page" + dateName +".png";
    
    try {
        FileUtils.copyFile(Source, new File(Destination));
    } catch (Exception e) {
        
        e.printStackTrace();
    }
    
}*/


/*@Test
public void getFullPageScreenshot() throws IOException {
    
    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    String Destination = System.getProperty("user.dir") + "/Screenshots/" + "Amazon Full Page" + dateName +".jpg";
    
    AShot sshot = new AShot();
    
    Screenshot screenshot = sshot.shootingStrategy(ShootingStrategies.viewportPasting(300)).takeScreenshot(driver);
    ImageIO.write(screenshot.getImage(), "jpg", new File(Destination));
    
}



}*/
