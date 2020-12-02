package com.navigator.loginForAdminTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.collect.FluentIterable;
import com.navigator.genericLib.BaseClass;
import com.navigatorAdmin.objectRepository.AdminUser;
import com.navigatorAdmin.objectRepository.CreateAdminUser;
import com.navigatorAdmin.objectRepository.Dashboard;

public class AdminUserTest extends BaseClass{
	@Test
	public void createAdminUser() throws Throwable {
		
	String AdminUserName = flib.getExcelData("admin",2,1);
	String AdminUserEmail = flib.getExcelData("admin",2,2);
	double AdminUserPhone = flib.getnumericExcelData("admin", 2, 3);
	String str = String.valueOf(AdminUserPhone);
	
	//navigate to admin user module
	Dashboard dash =PageFactory.initElements(driver, Dashboard.class);
	dash.getAdminUserModule().click();
	
	//click on add admin button
	AdminUser admuser =PageFactory.initElements(driver, AdminUser.class);
	admuser.getAddAdminUserButton().click();
	
	//fill details and submit to add admin 
	CreateAdminUser cadminuser = PageFactory.initElements(driver, CreateAdminUser.class);
	cadminuser.getAdminUserNameField().sendKeys(AdminUserName);
	cadminuser.getAdminUserEmailField().sendKeys(AdminUserEmail);
	cadminuser.getAdminUserPhoneField().sendKeys(str);
	wclib.select(cadminuser.getAdminUserSelectRoleField(), 1);
	cadminuser.getSaveUserButton().click();
	
	System.out.println(admuser.getAddAdminUserSucessMsg().getText());
	
	//verify successfully message
	admuser.verifyUserAddedSuccessfully();
	
	}

}
