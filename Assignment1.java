


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

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		//create a  driver session
		WebDriver driver=new ChromeDriver();
		
		//open goggle application
		driver.get("http://www.google.com");
		
		//nevigate to amazon
		driver.navigate() .to("https://www.amazon.com");
        Thread.sleep(1000);
	    System.out.println();
		
		//To title from the application
		String actTitle=driver.getTitle();
		System.out.println("Title is google and amazon : "+actTitle);
		
		
		
		//go back--->back()
		 driver.navigate().back();
				
		//To get the current url -getCurrentUrl()
			System.out.println("Google Application current url is : " +driver.getCurrentUrl());
			
			
			//forword()
			driver.navigate().forward();
			  Thread.sleep(1000);
			  
			  
			//To get the current url -getCurrentUrl()
				System.out.println("amazon Application current url is : " +driver.getCurrentUrl());
				
				
				//validate title with expected title
				if(actTitle.equals("amazon"))
				{
					System.out.println("Test pass.......Title");
				}else
				{
					System.out.println("Test Fail.....Title not match");
					
					
					//close the browser
					driver.quit();
					
				}
				
				
	}
	
}

			
	



