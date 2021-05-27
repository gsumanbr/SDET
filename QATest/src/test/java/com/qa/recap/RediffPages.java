package com.qa.recap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages {

    WebDriver driver;
    
    @FindBy(linkText="privacy policy")
    WebElement PrivacyPolicyLink;
    
   //Orange hrm 
    @FindBy(id = "txtUsername")
    WebElement hrmUsername;  
    
    @FindBy(id = "txtPassword")
    WebElement hrmpassword;  
    
    @FindBy(id = "btnLogin")
    WebElement hrmlogin;  
    
    public WebElement getUserName() {
        return hrmUsername;
    }
    
    public WebElement getPassword() {
        return hrmpassword;
    }
    
    public WebElement ClickLogin() {
        return hrmlogin;
    }
    //Orange hrm end
    
    @FindBy(linkText="terms and conditions")
    WebElement TermsandConditionsLink;
    
    public WebElement getPrivacyPolicyLink() {
        return PrivacyPolicyLink;
    }
    
    public WebElement getTermsandConditionsLink() {
        return TermsandConditionsLink;
    }
    

    @FindBy(linkText = "Sign in")
    WebElement SignInLink;  
        
    @FindBy(linkText="Create Account")
    WebElement CreateAccoutLink;
    
    @FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
    WebElement FullNameTextField;
    
    
    public WebElement getFullNameTextField1() {
        return FullNameTextField;
    }
    
    
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
    public WebElement getFullNameTextField() {
        return FullNameTextField;
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

    
    
    public RediffPages(WebDriver rdriver) {
        
        this.driver = rdriver;
        PageFactory.initElements(rdriver, this);
        
    }

}