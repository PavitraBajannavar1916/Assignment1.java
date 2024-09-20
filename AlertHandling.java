package com.webTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        
		
		//click on sign in
		driver.findElement(By.name("proceed")).click();
		
		//alert window
		//change driver focus to alert window
		Alert alt1=driver.switchTo().alert();
		
		System.out.println("Alert Text is: "+alt1.getText());
		
		//ok
		alt1.accept();
		
		//username
		driver.findElement(By.id("login1")).sendKeys("Pavitra");
		
		
	}

}
