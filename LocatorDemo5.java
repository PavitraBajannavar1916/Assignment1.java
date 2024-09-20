package com.webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        //name of input Boxes
        List<WebElement> allInputs=driver.findElements(By.tagName("input"));
        System.out.println("Total Input Boxes are:+allInputs.size()");
        System.out.println("allInputs");
        
        //Number of images
       List<WebElement> allImages=driver.findElements(By.tagName("img"));
       System.out.println("Total Image are:" +allImages.size());
	
	  //Number of links +get the attribute value +text of link in console
       List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	   System.out.println("Totale links are:" +allLinks.size());
	   
	   for(WebElement i:allLinks)
	   {
	   System.out.println(i.getAttribute("href"));
	   }
	
	
	
	}
	
}
	
	
	
	


	



	
	
