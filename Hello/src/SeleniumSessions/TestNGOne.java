package SeleniumSessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;

public class TestNGOne 
{
	static WebDriver driver;
	
	@BeforeGroups
	public void beforegroup()
	{
		System.out.println("before group");
	}
	
  @Test (groups= {"Regression"}, priority=1)//actual automated test case
  public void TC001() 
  {

	  System.out.println("iam in the  test case 1");
	  driver.get("https://www.google.com");
	  Assert.fail();
	  
  }
  
  @Test (groups= {"Smoke"}, priority=3, dependsOnMethods = "TC001") //actual automated test case
  public void TC002() {

	  System.out.println("iam in the  test case 2");
	  driver.get("https://www.facebook.com");
	  
  }
  
  @Test (groups= {"Smoke","Regression"}, priority=2) //actual automated test case
  public void TC003() {

	  System.out.println("iam in the  test case 3");
	  driver.get("https://www.linkedin.com");
	  
  }
  
  @BeforeMethod //this method will be run before the test case execution
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("iam executed before each test case");
	  
  }

  @AfterMethod //this method will be run after the test case execution
  public void afterMethod() {

	  System.out.println("iam executed after each test case");
	  driver.close();
  }

}
