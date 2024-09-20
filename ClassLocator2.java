package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator2 {

	public static void main(String[] args) {
	
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("btn")).click();
		
	}

}
