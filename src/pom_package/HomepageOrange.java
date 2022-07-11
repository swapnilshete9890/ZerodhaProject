package pom_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepageOrange {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[text()='Admin']")
	private WebElement Admin;
	
	@FindBy(xpath="//*[text()='PIM']")
	private WebElement PIM;
	
	@FindBy(xpath="//*[@id=\"welcome\"]")
	private WebElement Avtar;
	
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	private WebElement Logout;
	
	
	
	
	
	public HomepageOrange(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void ValidateAdminTab()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Admin']")));
		Admin.isDisplayed();
	}
	
	public void ValidatePIMTab()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='PIM']")));
		
		PIM.isDisplayed();
	}
	
	public void ClickOnAvtar()
	{
		 Avtar.click();
	}
	
	public void ClickOnLogout()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Logout']")));
		
		Logout.click();
	}

}
