package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		/*//maximize the browser
		//driver.manage().window().maximize();
		
		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("test123");
		
		//check
		driver.findElement(By.id("remember")).click();
		
		//submit
		driver.findElement(By.id("submit-id")).click();*/
		
		
		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("test123");
	
		//check
		driver.findElement(By.id("remember")).click();
		
		//submit
		driver.findElement(By.className("btn-default")).click();
		
		
		
		
		
		
		
	}

}
