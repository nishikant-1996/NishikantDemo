package com.navigatorAdmin.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(xpath="//a[@href='https://navigatorstg-admin.bizeebuy.com/site/login']")
    private WebElement AdminLoginLink;
    public WebElement getAdminLoginLink() {
    	return AdminLoginLink;
    }
    @FindBy(xpath="//a[@href='/auth/login']")
    private WebElement ClientLoginLink;
    public WebElement getClientLoginLink() {
    	return ClientLoginLink;
    }
    @FindBy(xpath="//a[@href='https://navigatorstg-site.bizeebuy.com/auth/login']")
    private WebElement PlantLoginLink;
    public WebElement getPlantLoginLink() {
    	return PlantLoginLink;
    }
    
}
