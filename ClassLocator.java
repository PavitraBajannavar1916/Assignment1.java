package com.webTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) {
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=accound/login");
	   //email
		driver.findElement(By.id("eamil")).sendKeys("test@gmail.com");
		//login--------->this is a css selector
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();		

	}

}
