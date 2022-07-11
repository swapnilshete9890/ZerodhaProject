package pom_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBLogin {

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement Pass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement logiin;
	
	
	
	
	public FBLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void Username()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']"))); //Explicit wait used for only WebElement
		
		Email.sendKeys("swapnil98998");
	}
	
	public void Password()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']")));
		
		Pass.sendKeys("2132434frfnerfbj");
	}
	
	public void ClickOnSigninButton()
	{
		 logiin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
