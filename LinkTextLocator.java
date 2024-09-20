package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://automationplayground.com/crm/");
		
		driver.findElement(By.linkText("Sign In")).click();
		
	   }
	
}
	
	/* 
	
	 Navigated to: https://automationplayground.com/crm/signin
     
      */
	
	


