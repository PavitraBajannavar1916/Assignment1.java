package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemolinktext {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://automationplayground.com/crm/");
		//sign in link
		driver.findElement(By.linkText("Sign In")).click();	
		//partiallink
		driver.findElement(By.id("sign")).click();
	}
	
}

