package clearTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchHotelTest {
  @Test
  public void serachHotel() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.cleartrip.com/hotels");
	  
	  SearchHotels sh = new SearchHotels(driver);
	  
	
	  sh.whereEnterText("Bangalore");
	  System.out.println("Where Enter Text --- 1");
	  
	  
	  sh.checkIn();
	  System.out.println("Check In -----2");
	  
	  
	  
	  //sh.checkOutText("Fri, 21 Feb, 2020");
	  System.out.println("Check out ----3");
	  
	 
	  sh.travelersSelect(2);
	  System.out.println("Travellers");
  }
}
