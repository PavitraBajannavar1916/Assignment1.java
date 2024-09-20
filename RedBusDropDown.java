package com.webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("hattps://www.redbus.in/");
		
		//from
		WebElement fromele=driver.findElement(By.id("src"));
		fromele.click();
		fromele.sendKeys("Pune");
		
		List<WebElement> fromlist=driver.findElements(By.xpath("//ul[@class'sc-dnqmqq dZhbJF']//li//text[@class='placeHolderMainText'])"));
        System.out.println("Total options are: "+fromlist.size());
	     for(WebElement i:fromlist)
	     {
	    	 System.out.println(i.getText());
	    	 if(i.getText().contains("Kothrud"))
	    	 {
	    		 i.click();
	    		 break;
	    	 }
	    	 
	     }
        
        
        
	}

}
