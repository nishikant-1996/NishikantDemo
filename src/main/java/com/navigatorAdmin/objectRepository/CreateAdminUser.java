package com.navigatorAdmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAdminUser {
	@FindBy (xpath="//input[@id='subuser-name']")
	private WebElement AdminUserNameField ;
	public WebElement getAdminUserNameField() {
		return AdminUserNameField ;
	}
	@FindBy (xpath="//input[@id='subuser-email']")
	private WebElement AdminUserEmailField;
	public WebElement getAdminUserEmailField() {
		return AdminUserEmailField;
	}
	@FindBy (xpath="//input[@id='subuser-phone_no']")
	private WebElement AdminUserPhoneField ;
	public WebElement getAdminUserPhoneField() {
		return AdminUserPhoneField;
	}
	@FindBy (xpath="//select[@id='subuser-role']")
	private WebElement AdminUserSelectRoleField ;
	public WebElement getAdminUserSelectRoleField() {
		return AdminUserSelectRoleField;
	}
	@FindBy (xpath="//button[contains(text(),'Save User')]")
	private WebElement SaveUserButton ;
	public WebElement getSaveUserButton() {
		return SaveUserButton ;
	}
	@FindBy (xpath="//a[contains(text(),'Back')]")
	private WebElement CreateAdminUserBackButton;
	public WebElement getCreateAdminUserBackButton() {
		return CreateAdminUserBackButton;
	}

}
