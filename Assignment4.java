
//write a script to automate https://www.naukri.com/page
//get total count of links
//print href value and text of every link into console




package com.webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
	   //create a driver session
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/page");
		
		  
        //Number of images
       List<WebElement> allImages=driver.findElements(By.tagName("img"));
       System.out.println("Total Image are:" +allImages.size());
	
		   //Number of links +get the attribute value +text of link in console
	       List<WebElement>allLink=driver.findElements(By.tagName("a"));
		   System.out.println("Totale links are:" +allLink.size());
		   
		   
		   for(WebElement i: allLink)
		   {
		   System.out.println(i.getAttribute("href"));
		   System.out.println(i.getText());
		   }
		
		
		
	
	
	
	
	}
	
	
	

}
