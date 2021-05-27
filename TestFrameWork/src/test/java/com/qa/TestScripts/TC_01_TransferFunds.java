package com.qa.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_01_TransferFunds extends BaseTest{	
	@Test	
	public void TransferFund() throws IOException {
	FundTransferOR.ClickOnTransFerFunds();
	String pageurl = driver.getCurrentUrl();        
    if (pageurl.contains("transfer")){        	
    	Assert.assertTrue(true);
    	getScreenshot(driver,"TransferFund");
    }else {        	
    	Assert.assertTrue(false);
    	getScreenshot(driver,"TransferFund");
    }	
}
}
