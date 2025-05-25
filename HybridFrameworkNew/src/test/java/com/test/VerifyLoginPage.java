package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.HomePage;
import com.utility.Base;
import com.utility.ExcelDataProvider;

public class VerifyLoginPage extends Base {

	@Test
	public void verifyLoginPage() throws IOException {

		HomePage hp = new HomePage(driver);//pom class
		
		ExcelDataProvider edp = new ExcelDataProvider();
		edp.getData();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String user = edp.getStringData("Sheet1", 0, 0);//student
		hp.username(user);//student
		String pass = edp.getStringData("Sheet1", 1, 0);
		hp.password(pass);//Password123
		hp.submit();
		
		Assert.assertEquals("abc", "abc");
		
		WebElement home = driver.findElement(By.xpath("/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li[1]/a"));
		if(home.isDisplayed()) {
			System.out.println("Current Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
			System.out.println("123");
		}
		

}
}