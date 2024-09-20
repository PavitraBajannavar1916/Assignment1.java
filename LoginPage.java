package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver) 
	{  
		this.driver=driver;
		
	}
	
	//Locator
	By username=By.name("username");
	By password=By.name("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
	//

}


  /*  package com.PageobjectModel;
     
     import org.openqa.Selenium.WebDriver;
      import org.openqa.Selenium.chrome.ChromeDriver;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test
     
    Run All
    public class LoginPageTest
    {
     public WebDriver driver;
     @BeforeClass
     public void setup()
     {
     driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     }
   
     @Test
     Run | Debug
     public void validdateLogin()
     {
       LoginPage lp=new LoginPage(driver);
       lp.setUserName("Admin");
       lp.setPassword("admin123");
       lp.clickButton();
       Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"LoginFail!");
       System.out.println("Login Pass!");
        }
       }    */
   