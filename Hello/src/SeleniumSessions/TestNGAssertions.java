package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
	
	@Test
	public void tetsNGAssertions() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "c://selenium//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		String actualTitle = "Gmail1";
		Assert.assertEquals(driver.getTitle(), actualTitle);
		System.out.println("Hard Assert Executed");
		Thread.sleep(5000);
		driver.close();
			
	}
	
	public void softAsserts() {
		//SoftAssert example
		System.setProperty("webdriver.gecko.driver", "c://selenium//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		String actualTitle = "yahoo11";
		SoftAssert softassert = new SoftAssert()
		softassert.assertEquals(driver.getTitle(), actualTitle);
		System.out.println("Soft Assert Executed");
				
	}

}
