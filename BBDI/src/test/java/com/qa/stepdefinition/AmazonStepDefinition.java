package com.qa.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepDefinition {
	
	WebDriver driver;
	AmazonPages AmazonOR;
	// test fixtures in Cucumber --> Hooks
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		AmazonOR = new AmazonPages(driver);
	}
	
	
	
	@Given("^the user is on amazon page$")
	public void the_user_is_on_amazon_page() {
		driver.get("https://www.amazon.in/");
	}

	
	@Then("^close the browser$")
	public void close_the_browser(){
		driver.quit();
	}

	@When("^the title of the page has amazon keyword$")
	public void the_title_of_the_page_has_amazon_keyword() {
		boolean status = driver.getTitle().contains("Amazon");		
		Assert.assertTrue(status);	
	}

	@Then("^select Books a category$")
	public void select_Books_a_category() {
		AmazonOR.setCategoryInput("Books");
	}

	@Then("^type da vinci code$")
	public void type_da_vinci_code() {
		AmazonOR.setSearchTextBoxInput("Da vinci code");
	}

	@Then("^click magnifier button$")
	public void click_magnifier_button() {
		AmazonOR.setMagnifierBtnClick();
	}

	@Then("^check the title of the page$")
	public void check_the_title_of_the_page() {
		boolean status = driver.getTitle().contains("Da vinci code");		
		Assert.assertTrue(status);	
	}

	@Then("^check the total number footer links present on the page$")
	public void check_the_total_number_footer_links_present_on_the_page() {
		List<WebElement> footerLinks = AmazonOR.getFooterLinks();
		int size = footerLinks.size();
		Assert.assertTrue(size>50);
	}

	@Then("^check the total number of hyper links present$")
	public void check_the_total_number_of_hyper_links_present() {
		List<WebElement> hyperLinks = AmazonOR.getHyperLinks();
		int size = hyperLinks.size();
		Assert.assertTrue(size==392);
	}
}