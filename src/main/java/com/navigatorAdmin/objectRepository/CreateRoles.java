package com.navigatorAdmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateRoles {
	@FindBy(xpath="//input[@id='rolesform-role']")
	private WebElement RoleNameField;
	public WebElement getRoleNameField() {
		return RoleNameField;	
	}
	@FindBy(xpath="//textarea[@id='rolesform-description']")
	private WebElement RoleDescriptionField;
	public WebElement getRoleDescriptionField() {
		return RoleDescriptionField;	
	}
	@FindBy(xpath="//input[@value='canAdminViewDashboard']")
	private WebElement ViewDashboardCheckbox;
	public WebElement getViewDashboardCheckbox() {
		return ViewDashboardCheckbox;	
	}
	@FindBy(xpath="//input[@value='canAdminViewDashboardStatistics']")
	private WebElement ViewStatisticsOnDashboardCheckbox;
	public WebElement getViewStatisticsOnDashboardCheckbox() {
		return ViewStatisticsOnDashboardCheckbox;
	}
	@FindBy(xpath="//input[@value='canAdminViewDashboardStatusGraph']")
	private WebElement ViewStatusGraphOnDashboardCheckbox;
	public WebElement getViewStatusGraphOnDashboardCheckbox() {
		return ViewStatusGraphOnDashboardCheckbox;
	}
	@FindBy(xpath="//div[@class='panel-footer text-right'] /button[@type='submit']")
	private WebElement CreateButton;
	public WebElement getCreateButton() {
		return CreateButton;
	}

}
