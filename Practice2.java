package com.webTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
	
		//craete a driver session
		WebDriver driver=new ChromeDriver();
		
		//to get the application  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//to get the title of the application
		String actTitle=driver.getTitle();
		System.out.println("Title is:"+actTitle);
		
		//to get the currenturl of the application
		System.out.println("Application is:" +driver.getCurrentUrl());
		
		//to get the PageSource of the application
		System.out.println("Application is:" +driver.getPageSource());
	}
}
