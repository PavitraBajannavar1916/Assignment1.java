package com.webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		
      
		WebDriver driver=new ChromeDriver();
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://automationplayground.com/crm/login.html");	
	
		
		//to login to application
	 driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	 
	 driver.findElement(By.id("password")).sendKeys("test123");
	 
	 
	 driver.findElement(By.id("remember")).click();
	 
	 driver.findElement(By.id("submit-id")).click();
	 
	 driver.findElement(By.id(" Logout")).click();
	
	
	}
	
	
	

}
