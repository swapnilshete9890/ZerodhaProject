package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_package.FBLogin;

public class FBTNG {
	
	WebDriver driver;
	
	@BeforeClass
	public void b4class()
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");	

	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.facebook.com/");
	}
	@BeforeMethod
	public void ValidateLogin()
	{
		 FBLogin lg=new FBLogin(driver);
		    lg.Username();
		    lg.Password();
		    lg.ClickOnSigninButton();
		    System.out.println("BEFORE METHOD");
	}
	@Test
	public void test1()
	{
		System.out.println("TEST 1");
	}
	
	@AfterMethod
	public void aftrmethod()
	{
		System.out.println("AFTER METHOD");
	}
	@AfterClass
	public void aftrclass()
	{
		System.out.println("AFTER CLASS");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
