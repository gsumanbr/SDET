package com.qa.recap;

import org.testng.annotations.Test;

public class TC_Rediff_01 extends BaseTest{

	// validate the registration page
	
//	
//	1. Open the browser
//	2. Launch the URL
//	3. Click on the create account link
//	4. enter the full name "Kim smith"
//	5. enter email id as test@test.com
	@Test
	public void createAccount() {	
		
		RediffOR.setCreateAccoutLinkClick();
		RediffOR.getFullNameTextField().sendKeys("Kim Smith");
		RediffOR.getEmailIDTextField().sendKeys("Kim Smith");
					
		
	}
	
	
}