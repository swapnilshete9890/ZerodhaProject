package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_package.GoibiboFlight;

public class GoibiboTNG {
	
	WebDriver driver;
	
	@BeforeClass
	public void opensite()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");	

		   driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.navigate().to("https://www.goibibo.com/");
			
	}
	
	@BeforeMethod
	public void BookFlight()
	{
		System.out.println("before method");
	}
	@Test
	public void ValidateBooking()
	{
		GoibiboFlight go=new GoibiboFlight(driver);
		go.Trip();
		go.TripFrom();
	//	go.TripTo();
		System.out.println("flight");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("flight takeoff");

	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("flight land to destination");

	}
	
	
	
	
	
	
	
	
	
	

}
