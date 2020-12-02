package com.navigatorAdmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.navigator.genericLib.FileLibrary;

public class Login {

	    @FindBy(id="username")
	    private WebElement Email;
	    public WebElement getEmail() {
	    	return Email;
	    }
	    @FindBy(name="pwd")
	    private WebElement Password;
	    public WebElement getPassword() {
	    	return Password;
	    }
	    @FindBy(xpath="//div[text()='Login ']")
	    private WebElement LoginButton; 
	    public WebElement getLoginButton() {
	    	return LoginButton;
	    }
	    @FindBy(xpath="//a[@class='forgot-password pull-right']")
	    private WebElement ForgotPasswordLink;
	    public WebElement getForgotpasswordLik() {
	    	return ForgotPasswordLink;
	    }
	    public void loginToApp(String email, String password) throws Throwable {
	    FileLibrary flib= new FileLibrary();
	    getEmail().sendKeys(flib.getPropertyFileData("AdminEmail"));
	    getPassword().sendKeys(flib.getPropertyFileData("AdminPassword"));
	    getLoginButton().click();
	    }
}
