package com.qa.recap;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertsExp extends BaseTest {
       
@Test
public void createAccount() {

        SoftAssert sassert = new SoftAssert();
	
	RediffOR.setCreateAccoutLinkClick();	
	  
	 boolean contains = driver.getCurrentUrl().contains("register");
	 sassert.assertEquals(contains, true);
	//Assert.assertEquals(contains, true); // URL will be validated if it true / false
			//  if true execution will continue
			//  If false execution will terminate
	RediffOR.getFullNameTextField().sendKeys("Kim Smith");
	RediffOR.getEmailIDTextField().sendKeys("test@test.com");
	 sassert.assertAll();			
	
}


}