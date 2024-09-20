package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locater2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		driver.findElement(By.id("email-id")).sendKeys("tesr@gmail.com");
		driver.findElement(By.id("passaword")).sendKeys("test123");
		driver.findElement(By.className("btn")).click();

	}

}
