package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStategy {

	public static void main(String[] args) {
	
		
		//Create the driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//search box
		/*
		//Strategy 1 : By Locater
		
		//To get address of search box
		By searchBox=By.id("APjFqb");
		
		//To identify WebElement
		driver.findElement(searchBox) . sendKeys("Java");
		*/
		
		//Strategy 2 : IdentifyElement  +perform action
		//driver.findElement(By.id("APjFqb")).sendKeys("TestNg");
		
		//Strategy 3 : IdentifyElement +validation+perform action
		WebElement ele=driver.findElement(By.id("APjFqb"));
		System.out.println("Is SearBox is displayed?: "+ele.isDisplayed());
		System.out.println("Is SearBox is enable?: "+ele.isEnabled());
	
		if(ele.isDisplayed() && ele.isEnabled())
		{
			
			
		
		
		}
		
	}
	
}


	
	
	
	


