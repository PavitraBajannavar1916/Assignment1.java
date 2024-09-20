package com.webTest;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password")).sendKeys("tesr123");
		
		//button-InvalidSelectorException:compound class names not permitted
	  //driver.findElement(By.className("btn btn-primary")).click();
		//login---->cssSelectors
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	
	}
}


