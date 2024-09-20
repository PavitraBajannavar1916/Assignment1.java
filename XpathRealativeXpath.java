package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRealativeXpath {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://automationplayground.com/crm/login.html");
		//xpath with attribute
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test123");	

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath(" //button[@name='submit-name']")).click();
	}

}
