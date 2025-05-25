package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	   @FindBy(id ="username") //Annotation 
	   private WebElement USERNAME;//Encapsulation
	   
	   @FindBy(id ="password") //Annotation 
	   private WebElement PASSWORD;//Encapsulation
	   
	   @FindBy(id ="submit") //Annotation 
	   private WebElement SUBMIT;//Encapsulation
	  
		
		public HomePage(WebDriver driver)
		{
		    PageFactory.initElements(driver,this) ;
		}
	
		public void username(String user)
		{
			
			USERNAME.sendKeys(user);//student

	    }
		
		public void password(String pass) {
			
			PASSWORD.sendKeys(pass);//Password123

	    }
		
		public void submit() {
			
			SUBMIT.click();

	    }

}
