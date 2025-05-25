package com.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base {

	public static WebDriver driver;
	@BeforeTest
	@Parameters({"Browser"})
	public void browserLaunch(String browser)
	{
	 if(browser.equalsIgnoreCase("chrome"))
	  {
		 driver=new ChromeDriver();
		
	  }
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	// driver = new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	}
	@AfterMethod
	public void failedScreenshot(ITestResult result) throws IOException{
	if(ITestResult.FAILURE ==result.getStatus()) 
	{
	   Screenshot.getScreenshot(driver);
	}
	else if(ITestResult.SUCCESS==result.getStatus())
	{
	 Screenshot.getScreenshot(driver);
	}

}
}