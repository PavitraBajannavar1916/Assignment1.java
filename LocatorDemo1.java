package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
	    //maximize()
	//	driver.manage(.window().maximize();
		
		//email
	 driver.findElement(By.id("email-id")) .sendKeys("test@gmail.com");
	  
	  //passaword
	  driver.findElement(By.id("password")) .sendKeys("test123");
	  
	  //check
	 driver.findElement(By.id("remember")) .click();
	 
	 
	 
	
	  //submit
       driver.findElement(By.id("submit-id")) . click();
	
	
	
	
	}
	
	
	
	
	
	

}
