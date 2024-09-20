package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo7Xpath {

	public static void main(String[] args) {
		
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//email
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");   
		
		//password
		driver.findElement(By.id("input-password")).sendKeys("test123");
		
		//login the page
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();		
	}

}
