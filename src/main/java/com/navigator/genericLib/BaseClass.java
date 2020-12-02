package com.navigator.genericLib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.navigatorAdmin.objectRepository.Dashboard;
import com.navigatorAdmin.objectRepository.Home;
import com.navigatorAdmin.objectRepository.Login;

public class BaseClass {
	
	public static WebDriver driver;
	public FileLibrary flib= new FileLibrary();
	public WebdriverCommonLibrary wclib =new WebdriverCommonLibrary();
	
	@BeforeClass
	public WebDriver initializeDriver() throws Throwable{
	String browserName =flib.getPropertyFileData("browser");
	if(browserName.equalsIgnoreCase("chrome")){
		driver = new ChromeDriver();	}
	else if(browserName.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();	}
	else if(browserName.equalsIgnoreCase("Internet Explorer")){
		driver = new InternetExplorerDriver();	}
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	}
	
	@BeforeMethod
	public void logIn() throws Throwable {
		
		String URL = flib.getPropertyFileData("url");
		String EMAIL=flib.getPropertyFileData("AdminEmail");
		String PASSWORD=flib.getPropertyFileData("AdminPassword");
		driver.get(URL);
		Home hom =PageFactory.initElements(driver, Home.class);
		hom.getAdminLoginLink().click();
		Login lp =PageFactory.initElements(driver, Login.class);
		lp.loginToApp(EMAIL,PASSWORD);
	}
	
	@AfterMethod
	public void logOut() {
		Dashboard db = PageFactory.initElements(BaseClass.driver, Dashboard.class);
		db.getMyAccountDropdown().click();
		db.getLogout().click();
	}
	
	@AfterClass
	public void closedriver() {
		driver.close();
	}
}
