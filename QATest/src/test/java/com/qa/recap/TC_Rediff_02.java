package com.qa.recap;

import org.testng.annotations.Test;

public class TC_Rediff_02 extends BaseTest {
	
	// Sign in for an existing user..
	
//	1. Open the browser
//	2. Launch the URL
//	3. Click on sign in link
//	4. check if the user is landed on login page
//	5. Enter the user name
//	6. enter the password
//	7. check and deselect the check box "Keep me signed in"
//	8. click on the submit button
//	9. close the browser
	
	@Test
	
	public void Login() throws InterruptedException {
		
		RediffOR.setSignInLinkClick();
		
		boolean contains = driver.getCurrentUrl().contains("login");
		if(contains) {
			System.out.println("the user is on login page");
			RediffOR.getUNameInputField().sendKeys("Kim Smith");
			RediffOR.getPwdInputField().sendKeys("Mercury");
			boolean selected = RediffOR.getRememberMeCheckBox().isSelected();
			if(selected) {
				RediffOR.getRememberMeCheckBox().click();
				Thread.sleep(2000);
				RediffOR.getSignInButton().click();
				Thread.sleep(2000);
			}
		}else {
			System.out.println("The user is not on login page");
		}
		
	}

}