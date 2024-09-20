package com.webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectBaseDropDown {
	
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		//get the address of dropdown
		 WebElement ddele=driver.findElement(By.id("searchDropdownBox"));
	    //select class 
		Select sc=new Select(ddele);
		
		System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
		
		//single selection
		sc.selectByIndex(3);
		sc.selectByValue("search-alias=computers");
		sc.selectByVisibleText("MP3 Music");
		
		//To get all the options---getoption()
		
		List<WebElement>alloptions=sc.getOptions();
		System.out.println("Total options are: "+alloptions.size());
		
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Luxury Beauty"))
			{
				i.click();
				break;
			}
		}
		
	}
	
}
		
		
		
	 /*  Is dropdown support multiple selection?: false
          Total options are: 44
          All Categories
          Alexa Skills
          Amazon Devices
          Amazon Fashion
          Amazon Pharmacy
          Appliances
          Apps & Games
          Audible Audiobooks
          Baby
          Beauty
          Books
          Car & Motorbike
          Clothing & Accessories
          Collectibles
          Computers & Accessories
          Deals
          Electronics
          Furniture
          Garden & Outdoors
          Gift Cards
          Grocery & Gourmet Foods
          Health & Personal Care
          Home & Kitchen
          Industrial & Scientific
          Jewellery
          Kindle Store
          Luggage & Bags
          Luxury Beauty
          
          It clicked "Luxury Beauty"    */
           
            

		
	




	


