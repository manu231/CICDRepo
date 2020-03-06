package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Framework.DriverUtility;

public class linkedinLogin {

	public static void main(String[] args)
	{
	WebDriver driver = DriverUtility.setupBrowser("firefox","https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	DriverUtility d = new DriverUtility(driver);
	//driver.get("https://www.linkedin.com");
	
	// step 1 -- Launch the linkedIn URL
	//driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	String ExpectedTitle = "LinkedIn Login, Sign in | LinkedIn";
	String ActualTitle = driver.getTitle();
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	
	// step 2 ---- Enter User ID
	By userID = By.id("username");
	WebElement userIDText = driver.findElement(userID);
	userIDText.sendKeys(" chillara.rao@gmail.com");
	
	// step 3 -- enter the password
	
	By pwd = By.id("password");
	WebElement pwdText = driver.findElement(pwd);
	pwdText.sendKeys("chillara1234" );
	
	//step 4 ---- click on sign in button
	By sign = By.className("btn__primary--large");
	WebElement signInButton = driver.findElement(sign);
	
	signInButton.click();
	
	String ExpectedMessage = "Hmm, that's not the right password. Please try again or request a new one.";
	
	//Step 5 --Identify error message 
	By error = By.id( "error-for-password");
	WebElement errorMessage = driver.findElement(error);
	String ActualMessage = errorMessage.getText();
			
	Assert.assertEquals(ActualMessage, ExpectedMessage);
	
	Point p = new Point(200,150);
	DriverUtility.rePosition(p);
	
	//DriverUtility.shutBrowser();
			
	

	
	
	
	}

}
