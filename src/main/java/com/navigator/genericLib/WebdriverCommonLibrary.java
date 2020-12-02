package com.navigator.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLibrary {
	
	public void select(WebElement elemnet, int index) {
        Select sel = new Select(elemnet);
		sel.selectByIndex(index);
	}
	
	public void select(WebElement elemnet, String visibletext) {
        Select sel = new Select(elemnet);
		sel.selectByVisibleText(visibletext);
	}

	public void waitForpageload() {
	    BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForExpactedElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void Actionsmovetoelement(WebElement element) {
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(element).build().perform();
	}
	
	public void Actionclick(WebElement element){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(element).click().build().perform();
	}
	
	public void Alertclik() {
		BaseClass.driver.switchTo().alert().accept();
	}
	
	public void Alertdismiss() {
		BaseClass.driver.switchTo().alert().dismiss();
	}
	
	public void maximizeTab() {
		BaseClass.driver.manage().window().maximize();
	}
	
}


