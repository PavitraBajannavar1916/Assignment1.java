
//write a automation script to automate orangehrm application login and logout


package com.webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		//to go to the website
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//email
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//passaword
		driver.findElement(By.name("password")).sendKeys("Admin123");
		
		//login
		driver.findElement(By.className("oxd-button")).click();
		
		//click on icon
		driver.findElement(By.className("oxd-usedropdown-icon")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
