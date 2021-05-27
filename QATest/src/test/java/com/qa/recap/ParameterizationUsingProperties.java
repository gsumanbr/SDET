package com.qa.recap;

import java.io.IOException;


import org.testng.annotations.Test;

public class ParameterizationUsingProperties extends BaseTest {
		
		@Test
		public void login() throws IOException, InterruptedException {
			RediffOR.setCreateAccoutLinkClick();
			Thread.sleep(2000);
			String Uname = Prop.getProperty("UserName");			
			String Email =Prop.getProperty("Email");			
			RediffOR.getFullNameTextField().sendKeys(Uname);
			RediffOR.getEmailIDTextField().sendKeys(Email);
			
			
			
		}

	}

