package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectore {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
         driver.get("https://saucedemo.com/");
		//tagname with id
		  driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//tagname with attribute
		 driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		 //tagname with classname
		// driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		 //tagnamewith id.classname.attribute
		driver.findElement(By.cssSelector("input#login-button.submit-button[type='submit']")).click();
		

	}

}
