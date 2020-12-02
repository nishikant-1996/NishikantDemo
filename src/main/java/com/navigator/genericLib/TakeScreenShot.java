package com.navigator.genericLib;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TakeScreenShot implements ITestListener {
	WebDriver driver;
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("TEST FAILURE");
		try
		{
			File screenShotTempFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Path source=screenShotTempFile.toPath();
			File onTestFailScreenShot = new File("target/"+ result.getName()+"_Fail_screenshot_"+new Date().getTime()+".png");
			Path target= onTestFailScreenShot.toPath();
		    Files.copy(source, target);
			System.out.println("screenshot file location: "+ onTestFailScreenShot.getAbsolutePath());
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
