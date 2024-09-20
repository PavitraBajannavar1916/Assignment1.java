package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1LinkText {

	public static void main(String[] args) {
	    
		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https:/automationplayground.com/crm");
		//signIn Link by LinkText
		driver.findElement(By.linkText("sign In")).click();
		// sign in Link by partial linkText
		//driver.findElement(By.linkText("sign")).click();
	}

}
