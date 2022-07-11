package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_package.FBLogin;
import pom_package.LogInPage;

public class Sample_TestClass {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");	

    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.navigate().to("https://www.facebook.com/");
	
//Test Case-1
    
    System.out.println("Validate login functionality");
    FBLogin lg=new FBLogin(driver);
    lg.Username();
    lg.Password();
    lg.ClickOnSigninButton();
    
//Test Case-2
    
    System.out.println("Validate homepage functionality");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
}
