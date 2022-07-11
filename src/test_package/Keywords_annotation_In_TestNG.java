package test_package;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keywords_annotation_In_TestNG {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before TEST");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority=1,dependsOnMethods= {"test2"})
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test (priority=2, invocationCount=3)
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test(priority=4)
	public void test3()
	{
		//Assert.fail();
		System.out.println("Test 3");
		
	}
	
	@Test (priority=-1)
	public void test4()
	{
		System.out.println("Test  4");
	}
	
	@Test (enabled=false)
	public void test5()
	{
		System.out.println("Test  5");
	}
	
	@Test (timeOut=3000)
	public void test6()
	{
		System.out.println("Test  6");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After TEST");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite");
	}
	
/*Keywords in TestNG
 * 
 * priority(default priority is 0) less number higher the priority
 * invocationCount--test case run many time 
 * dependsOnMethods--test case depend on other test case
 * Assert.fail();---to fail the test case
 * 	enabled=false---to disabled test case
 * timeOut=2000 (in millisecond)
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
