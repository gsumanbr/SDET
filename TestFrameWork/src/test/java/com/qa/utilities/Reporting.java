package com.qa.utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{

    ExtentHtmlReporter HtmlReporter;
    ExtentReports xReports;
    ExtentTest xTest;



    public void onStart(ITestContext testContext) {
        String name = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String ReportName = "Test-Results" + name +".html";

        HtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/" + ReportName);
        HtmlReporter.config().setDocumentTitle("Automation Testing");
        HtmlReporter.config().setReportName("Function Test Report");
        HtmlReporter.config().setTheme(Theme.DARK);
        HtmlReporter.config().setAutoCreateRelativePathMedia(true);

        xReports = new ExtentReports();
        xReports.attachReporter(HtmlReporter);
        xReports.setSystemInfo("QA Name", "Suman");

    }


    public void onTestSuccess(ITestResult tr) {
        xTest =  xReports.createTest(tr.getName());       
        xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
        String path=  System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+".png";
        try {
 		xTest.pass("Screenshot of test pass is:" + xTest.addScreenCaptureFromPath(path));
 	} catch (IOException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}


    }


    public void onTestFailure(ITestResult tr) {
        xTest =  xReports.createTest(tr.getName());       
        xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
       String path=  System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+".png";
       try {
		xTest.fail("Screenshot of test failed is:" + xTest.addScreenCaptureFromPath(path));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    }


    public void onTestSkipped(ITestResult tr) {

        xTest =  xReports.createTest(tr.getName());       
        xTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));

    }


    public void onFinish(ITestContext testContext) {          
        xReports.flush();         
    }



}