package com.navigatorAdmin.objectRepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminUser {
	
	String ExpectedSucessMsg = "User has been Created Successfully!";
	//add admin user button
	@FindBy (xpath="//a[@href='/sub-user/create']")
	private WebElement AddAdminUserButton;
	public WebElement getAddAdminUserButton() {
		return AddAdminUserButton;
	}
	
	//admin user added successfull message
	@FindBy (xpath="//div[@id='w1-success-0']")
	private WebElement AddAdminUserSucessMsg;
	public WebElement getAddAdminUserSucessMsg() {
	return AddAdminUserSucessMsg;
	}
	
	public void verifyUserAddedSuccessfully() {
	String ActualMsg = getAddAdminUserSucessMsg().getText();
	if (ActualMsg.contains(ExpectedSucessMsg)) {
		System.out.println("User has been Created Successfully!");
	     }
	}
	

}
