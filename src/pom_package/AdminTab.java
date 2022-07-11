package pom_package;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminTab {
	
	 WebDriver driver;
	WebDriverWait wait;
	
static int i=0;
	
	public static String timestamp() 
	{	
		 return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
	}
	
	public void  screenshot() throws IOException
	{    
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		   
		   File location=new File("D:\\Software Testing\\Selenium Notes\\Screenshot Method\\img"+i+" "+timestamp() +".jpg");
		   
		   FileHandler.copy(source, location);  
		   
		   timestamp() ;
		   
      i++;	
	}
	




	

	@FindBy(xpath="//*[text()='Admin']")
	WebElement Admin;
	
	@FindBy(xpath="//input[@name='searchSystemUser[userName]']")
	WebElement User;
	
	@FindBy(xpath="//option[text()='ESS']")
	WebElement UserRole;
	
	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']")
	WebElement EmployeeName;
	
	@FindBy(xpath="//option[text()='Enabled']")
	WebElement Status;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	WebElement Search;
	
	@FindBy(xpath="//input[@type='checkbox' and @value='21']")
	WebElement Checkbox;
	
	@FindBy(xpath="//input[@id='btnDelete']")
	WebElement Delete;
	
	@FindBy(xpath="//input[@class='btn']")
	WebElement OK;
	
	
	
	
	public AdminTab(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	public void ClickOnAdmin() throws IOException
	{
		Admin.click();
		screenshot();
	}
	
	public void User() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='searchSystemUser[userName]']")));
		User.sendKeys("Joe.Root");
		screenshot();
	}
	
	public void SelectUserRole() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='ESS']")));

		UserRole.click();
		screenshot();
	}
	
	public void EmpName() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")));

		EmployeeName.sendKeys("Joe Root");
		screenshot();
	}
	
	public void EmpStatus() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[text()='Enabled']")));

		Status.click();
		screenshot();
	}
	
	public void ClickOnSearchTab() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBtn']")));

		Search.click();
		screenshot();
	}
	
	public void ClickOnCheckbox() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox' and @value='21']")));

		Checkbox.click();
		screenshot();
	}
	
	public void DeleteData() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnDelete']")));

		Delete.click();
		screenshot();
	}
	public void ConfirmDelete() throws IOException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='btn']")));
		
		OK.click();
		screenshot();
	}
	
	
	
	
	
	
	
}
