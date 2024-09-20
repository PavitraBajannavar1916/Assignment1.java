package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithmethodsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		//xpath with text()
		WebElement ele=driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
        //System.out.println("Text of element:"+ele.getText());
	     ele.click();
	     
	     driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click(); 	     
	
	
	    String cartmsg=driver.findElement(By.tagName("h2")).getText();
	    System.out.println(cartmsg);
	
	   String cartmsg2=driver.findElement(By.xpath("//h2[contains(text(),'Cart is empty')]")).getText();
	    System.out.println("cart message with xpath:"+cartmsg2);
	    
	    driver.findElement(By.xpath("//input[contains(@id,'searchtextbox')]")).sendKeys("Watch",Keys.ENTER);
	    
	   WebElement ele3=driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearch')]"));
	   ele.clear();
	   ele3.sendKeys("bags",Keys.ENTER);
	   

}

}