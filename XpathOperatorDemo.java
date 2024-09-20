package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOperatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	 driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("kiyani");
	 //xpath with and operator
	// driver.findElement(By.xpath("//input[@placeholder='Last Name' and @class='form-control']")).sendKeys("Bhavi");
	//xpath with or operator
	 driver.findElement(By.xpath("//input[@placeholder='Last Name' or @class='form-contro']")).sendKeys("bhaji");
	 //xpath with index
      driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("test@gmail.com");
      //xpath with position
      driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("1234567891");
      
      driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("123456789");
      
      driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("123456789");
      
      driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
      
      driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
      
      driver.findElement(By.className("btn-primary")).click();
	}

}
          




/*      Your Personal Details
        First Name
        kiyani
        Last Name
        bhaji
        E-Mail
        test@gmail.com
        Telephone
        1234567891
        Your Password
        Password
        •••••••••
        Password Confirm
        •••••••••
        Newsletter
        Subscribe Yes No
        I have read and agree to the Privacy Policy Yes Continue   */

