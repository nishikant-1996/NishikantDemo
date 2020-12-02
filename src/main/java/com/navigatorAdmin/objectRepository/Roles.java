package com.navigatorAdmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roles {
	
	@FindBy(xpath="//a[@href='/roles/create']")
	private WebElement AddRolesButton;
	public WebElement getAddRolesButton() {
		return AddRolesButton;
	}
	@FindBy(xpath="//div[@class='/alert-success alert fade in'")
	private WebElement RolesSuccessMessage; 
	public WebElement getRolesSuccessMessage() {
		return RolesSuccessMessage;
	}
    @FindBy(xpath="//div[@class='summary']")
    private WebElement RolesCount;
	public WebElement getRolesCount() {
		return RolesCount;
	}
	@FindBy (xpath="//a[@class='btn btn-xs']")
	private WebElement UpdateRoleIcon;
	public WebElement getUpdateRoleIcon() {
		return UpdateRoleIcon;
	}
	

}
