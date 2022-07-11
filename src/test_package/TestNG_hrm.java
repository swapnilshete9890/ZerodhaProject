package test_package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_package.AdminTab;
import pom_package.HomepageOrange;
import pom_package.LogInPage;

public class TestNG_hrm {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");	

	   driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	}
	
    @BeforeMethod
    public void beforeMethod()
    {
    	 LogInPage login=new LogInPage(driver);
    	    login.sendUsername();
    	    login.sendPassword();
    	    login.ClickOnSigninButton();
    	    System.out.println("BEFORE METHOD");
    }

    
    @Test
    public void ValidateHomepage()
   {
    	HomepageOrange home=new HomepageOrange(driver);
    	home.ValidateAdminTab();
    	home.ValidatePIMTab();
    	System.out.println("test 1");
    	
    }
    
    @Test
    public void ValidateAdminTab() throws IOException
    {
    	AdminTab adm=new AdminTab(driver);
    	adm.ClickOnAdmin();
    	adm.User();
    	adm.SelectUserRole();	
    	adm.EmpName();
    	adm.EmpStatus();
    	adm.ClickOnSearchTab();
    	adm.ClickOnCheckbox();
    	adm.DeleteData();
    	adm.ConfirmDelete();
    	System.out.println("TEST 2");
    }
	
    @AfterMethod
    public void afterMethod()
    {
        HomepageOrange home=new HomepageOrange(driver);
        home.ClickOnAvtar();
        home.ClickOnLogout();
    	System.out.println("aftr method");
    }
	
    @AfterClass
    public void afterClass()
    {
    	System.out.println("aftr class");
//    	driver.quit();
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
