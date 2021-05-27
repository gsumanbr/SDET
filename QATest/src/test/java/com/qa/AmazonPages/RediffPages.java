package com.qa.AmazonPages;



import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffPages  
{

WebDriver driver;

@FindBy(linkText = "Sign in")
WebElement SignInLink;  
    
@FindBy(linkText="Create Account")
WebElement CreateAccoutLink;

@FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
WebElement FullNameTextField;

@FindAll(@FindBy(tagName="a"))
List<WebElement> ItemNames;

@FindBy(id="login1")
WebElement UNameInputField;

public WebElement getUNameInputField() {
    return UNameInputField;
}

@FindBy(name="proceed")
WebElement SignInButton;
public WebElement getSignInButton() {
    return SignInButton;
}


@FindBy(id="password")
WebElement PwdInputField;

public WebElement getPwdInputField() {
    return PwdInputField;
            
}


@FindBy(id="remember")
WebElement RememberMeCheckBox;

public WebElement getRememberMeCheckBox() {
    return RememberMeCheckBox;
}


@FindBy(xpath = "//tbody/tr[7]/td[3]/input[1]")
WebElement EmailIDTextField;

public WebElement getEmailIDTextField() {
    return EmailIDTextField;
}


// check if the signIn link is enabled or not?
public boolean getSignInLinkEnabled() {
    return SignInLink.isEnabled();
}


// click on the signIn link
public void setSignInLinkClick() {
    SignInLink.click();
}


public boolean getCreateAccoutLinkEnabled() {
    return CreateAccoutLink.isEnabled();
}


public void setCreateAccoutLinkClick() {
    CreateAccoutLink.click();
}

public int getlinks() {
	return ItemNames.size(); 
}
@FindBy(id="searchDropdownBox")
WebElement Category;


@FindBy(css="#twotabsearchtextbox")
WebElement SearchTextBox;


@FindBy(xpath="//input[@id='nav-search-submit-button']")
WebElement MagnifierBtn;

@FindBy(xpath ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")
WebElement SuccessMess;


// select a value
//select a value
public void setCategoryInput(String input) {
    Select sel = new Select(Category);        
    sel.selectByVisibleText(input);
}
// type a value
public void setSearchTextBoxInput(String input) {
    SearchTextBox.clear();
    SearchTextBox.sendKeys(input);
}

public Object LoginMess() {
    return SuccessMess;
}

// click the button

public void setMagnifierBtnClick() {
    MagnifierBtn.click();
}


			
public RediffPages(WebDriver rdriver) {
    
    this.driver = rdriver;
    PageFactory.initElements(rdriver, this);
    
}

@FindBy(id="nav-logo-sprites")
    WebElement amazonLogo;
    
    public WebElement getamazonLogo() {
        return amazonLogo;
    }

public WebElement getFullNameTextField() {
	// TODO Auto-generated method stub
	return FullNameTextField;
}
}




