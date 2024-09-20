
// write a Automation script to open google//
//Then navigate to amazon//
   //capture title of both applications//
   //then navigate back to  the google from amazon//
   //capture current url of google//
   //Then navigate forward and get the current url of amazon//
   //and validate title of amazon should contains online shopping//.
	//and close the browser	//   

package com.webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("http//www.google.com");
		Thread.sleep(2000);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().to("http//www.amazon.in");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		String title=driver.getTitle();
		if(title.contains("online shoping")) {
			System.out.println("Title contain online shopinh tab");
		}else {
			System.out.println("Title dosent contain online shoping tab");
		}
		
		driver.quit();
		
			
			
		}
		}
		
		
		
		
		



