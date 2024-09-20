package com.webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown
{
	public void selectBaseDropsown(WebElement ddele,String value)
	{
	
		Select d1=new Select(ddele);
		System.out.println("Is dropdown support multiple selection?: "+d1.isMultiple());
		List<WebElement>alloptions=d1.getOptions();
		System.out.println("Total options are: "+alloptions.size());
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
		{
				i.click();
				break;
		}
			
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
       //create an account
		driver.findElement(By.linkText("Create new account")).click();
		
		//day dropdown
	   WebElement dayele=driver.findElement(By.id("day"));
	   Utility.selectBasedDropdown(dayele,"12");
		
	   //month dropDown
	   WebElement monthdd=driver.findElement(By.id("month"));
	   Utility.selectBaseDropDown(monthele,"sep");
		//year dropDown
		WebElement yeardd=driver.findElement(By.id("year"));
		 Utility.selectBaseDropDown(yearele,"2024");
		
		
		
		
		
	   
	   
	/*	Select d1=new Select(dayele);
		System.out.println("Is dropdown support multiple selection?: "+d1.isMultiple());
		List<WebElement>alloptions=d1.getOptions();
		System.out.println("Total options are: "+alloptions.size());
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("12"))
		{
				i.click();
				break;
		}
			
		}*/
		
		
	}

}
