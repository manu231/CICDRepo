package Examples_Manohar;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptions {

	public static void main(String[] args) {

    
    
     
     System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  
	 WebDriver driver = new ChromeDriver();
	 String url = "https://www.cleartrip.com/hotel";
      //WebDriver driver = new FirefoxDriver();
      //String url = "http://demo.automationtesting.in/";
      driver.get(url);
      
      // Verify Url
      String actualUrl = driver.getCurrentUrl();
      
      if (actualUrl.equals(url)  ) {
    	  System.out.println( "Verification Successful - Correct Url is opened :---->" +actualUrl );
    	  
      }
      else {
    	  System.out.println( "Verification Failed - An incorrect Url is opened :---->" +actualUrl );
      }
     // NoSuchElementException
      System.out.println("No Such Element");
     try {
     WebElement wl = driver.findElement(By.id("Tagsss"));
     wl.sendKeys("Hyderabad");
     } catch(Throwable e) {
    	 e.printStackTrace();;
     } 
     
    
     System.out.println("SUCCESS");
     
	}

}
