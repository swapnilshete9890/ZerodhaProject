package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoibiboFlight {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath="(//span[@class='sc-grREDI cHzIzz'])[2]")
	WebElement RoundTrip;
	
	@FindBy(xpath="(//p[text()='Enter city or airport'])[1]")
	WebElement CityFrom;
	
	@FindBy(xpath="(//p[text()='Enter city or airport'])[2]")
	WebElement CityTo;
	

	public GoibiboFlight(WebDriver driver)
	{
        this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	public void Trip()
	{
		RoundTrip.click();
	}
	
	public void TripFrom()
	{
		CityFrom.sendKeys("Chandrapur");
	}
	
	public void TripTo()
	{
		CityTo.sendKeys("Pune");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
