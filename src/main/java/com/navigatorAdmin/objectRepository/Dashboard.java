package com.navigatorAdmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	
    //Roles Module
	@FindBy(xpath="//a[@href='/roles']")
	private WebElement RolesModule;
	public WebElement getRolesModule() {
		return RolesModule;
	}
	
	//AdminUser Module
	@FindBy (xpath="//a[@href='/sub-user']")
	private WebElement AdminUserModule ;
	public WebElement getAdminUserModule() {
		return AdminUserModule;
	}
	
	//Client Module
	@FindBy (xpath="//a[@href='/clients']")
	private WebElement ClientsModule ;
	public WebElement getClientsModule() {
	return ClientsModule;
	}
	
	//License Master Module
	@FindBy (xpath="//a[@href='/licence-master']")
	private WebElement LicenseMasterModule ;
	public WebElement getLicenseMasterModule() {
	return LicenseMasterModule;
	}

	//Section Module
	@FindBy (xpath="//a[@href='/section']")
	private WebElement SectionModule ;
	public WebElement getSectionModule() {
	return SectionModule;
	}
		
	//Regulation Module
	@FindBy (xpath="//a[@href='/regulation']")
	private WebElement RegulationModule ;
	public WebElement getRegulationModule() {
	return RegulationModule;
	}
	
	//Regulation Update Module
	@FindBy (xpath="//a[@href='/regulation-update/updates']")
	private WebElement RegulationUpdateModule ;
	public WebElement getRegulationUpdateModule() {
	return RegulationUpdateModule;
	}
		
	//Question Module
	@FindBy (xpath="//a[@href='/question']")
	private WebElement QuestionModule ;
	public WebElement getQuestionModule() {
	return QuestionModule;
	}
	
	//Client Response Module
	@FindBy (xpath="//a[@href='/client-response']")
	private WebElement ClientResponseModule ;
	public WebElement getClientResponseModule() {
	return ClientResponseModule;
	}
	
	//Questionnaire Module
	@FindBy (xpath="//a[@href='/create-questionnaire']")
	private WebElement QuestionnaireModule ;
	public WebElement getQuestionnaireModule() {
	return QuestionnaireModule;
	}
	
	//My account dropdown
	@FindBy(xpath="//li[@class='dropdown profile']")
	private WebElement MyAccountDropdown;
	public WebElement getMyAccountDropdown() {
	return MyAccountDropdown;
	}
	
	//Logout option
	@FindBy(xpath="//a[@href='/site/logout']")
	private WebElement Logout;
	public WebElement getLogout() {
	return Logout;	
	}
	

}
