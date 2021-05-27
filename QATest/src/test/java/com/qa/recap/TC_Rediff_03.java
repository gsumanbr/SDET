package com.qa.recap;


import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Rediff_03 extends BaseTest{
    
    @Test
    public void WorkingWithMultipleWindows() {
        
        RediffOR.setCreateAccoutLinkClick(); //Registration page
        
        RediffOR.getPrivacyPolicyLink().click(); // new Tab
        
        RediffOR.getTermsandConditionsLink().click(); // new windows
        
        Set<String> windowHandles = driver.getWindowHandles();
            
        
        Iterator<String> iterator = windowHandles.iterator();
        
        while(iterator.hasNext()) {
            String WindId = iterator.next();
            String title = driver.switchTo().window(WindId).getTitle();
            Reporter.log(title,true);
            
        }
        
    }

}
