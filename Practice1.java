package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
	 //open the google application
		driver.get("https://www.google.com");
		
		//to get the Title from application
		String actTitle=driver.getTitle();
		System.out.println("Title is:" +actTitle);
	
	   //To close the command
		//driver.quit();
		
		//to get the current url of the application
		System.out.println("Application current url is:"+driver.getCurrentUrl());
	
	     //to get page source of the application
		//driver.getPageSource();
		System.out.println("driver.getPageSource()");
	
		//naviagte to flipkart
		driver.navigate().to("https://www.Flipkart.com");
		
		//back to flipkart
		driver.navigate().back();
		
		//forword to flipkart
		driver.navigate().forward();
		
	
	
	
	
	}
	

}
