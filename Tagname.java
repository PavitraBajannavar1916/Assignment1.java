package com.webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		List<WebElement> allInputs=driver.findElements(By.tagName("input"));
		System.out.println("total input boxes are: "+allInputs.size());
		
		List<WebElement> allImages=driver.findElements(By.tagName("img"));
		System.out.println("total images are:" +allImages.size());
     
	}

}
