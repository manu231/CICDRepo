package clearTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homePageTest
{
	
  @Test
  public void searchFlight()
  {
  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.cleartrip.com");
  
  HomePage hp = new HomePage(driver);
  
  System.out.println("1");
  hp.oneWay_Click();
  
  System.out.println("2");
  hp.fromEnterText("Dallas, US - Love Field (DAL)");
  
  System.out.println("3");
  hp.toText("Washington, US - All airports (WAS)");
  
  System.out.println("4");
  hp.departText("Fri, 14 Feb, 2020");
  
  
  System.out.println("5");
  hp.adultSelect(2);
  
  System.out.println("6");
  hp.searchClick();
  }
}
