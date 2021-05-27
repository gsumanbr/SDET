package com.qa.testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Suman\\BBDI\\src\\test\\java\\com\\qa\\feature\\Amazon.feature"},
glue="com.qa.stepdefinitions",
dryRun=false,
strict=true,
monochrome=true,
format= {"pretty","html:test-output"}
        )





public class AmazonTestRunner {

}