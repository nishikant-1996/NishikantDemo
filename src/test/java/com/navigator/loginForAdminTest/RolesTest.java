package com.navigator.loginForAdminTest;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.navigator.genericLib.BaseClass;
import com.navigator.genericLib.WebdriverCommonLibrary;
import com.navigatorAdmin.objectRepository.CreateRoles;
import com.navigatorAdmin.objectRepository.Dashboard;
import com.navigatorAdmin.objectRepository.Roles;
@Listeners
public class RolesTest extends BaseClass {
	@Test
	public void createRoles() throws Throwable {
		
		String RoleName = flib.getExcelData("admin",1,1);
		String Description = flib.getExcelData("admin",1,2);
		
	    wclib.maximizeTab();
		wclib.waitForpageload();
		//navigate to Roles module 
		Dashboard dash = PageFactory.initElements(driver, Dashboard.class);
		dash.getRolesModule().click();
		//click on add roles button
		Roles rol =PageFactory.initElements(driver, Roles.class);
		rol.getAddRolesButton().click();
		//fill create role form and click on create button
		CreateRoles crol= PageFactory.initElements(driver, CreateRoles.class);
		crol.getRoleNameField().sendKeys(RoleName);
		crol.getRoleDescriptionField().sendKeys(Description);
		crol.getViewDashboardCheckbox().click();
		crol.getViewStatisticsOnDashboardCheckbox().click();
		crol.getViewStatusGraphOnDashboardCheckbox().click();
		crol.getCreateButton().click();
	    }
	

}
