package com.webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) {
		
		//ctrl+shift+o--> to import the classes
		
		//create  a driver session
		WebDriver driver=new ChromeDriver();
		
		
		//open google application
		driver.get("http://www.google.com");
		
		//To  get title from application- getTitle()
		String actTitle=driver.getTitle();
		System.out.println("Title is : "+actTitle);
		
		//validate title with expected title
		if(actTitle.equals("Google"))
		{
			System.out.println("Test pass.......Title");
		}else
		{
			System.out.println("Test Fail.....Title not match");
			
			//close the browser
			//driver.close();
			
			driver.quit();
		}
		
	}

}
