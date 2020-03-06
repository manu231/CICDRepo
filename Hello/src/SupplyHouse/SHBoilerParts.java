package SupplyHouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHBoilerParts {

	public static void main(String[] args) {
	
		String driverExecutablePath =  "C:\\Selenium\\geckodriver.exe";
			  
       System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
      // System.setProperty("webdriver.chrome.driver", driverExecutablePath);
			  
	   WebDriver driver = new ChromeDriver();
		      
	   String url = "https://www.supplyhouse.com/Boiler-Parts-Finder-Tool";
       driver.get(url);
       
       WebElement ModelNumber = driver.findElement(By.id("model-number"));
	   ModelNumber.sendKeys("AT082410C");	   
	   
	   WebElement search = driver.findElement(By.xpath("//button[@class='search-btn btn button-blue upper col-sm-1 col-md-4']"));
       search.click();
       
       //Validate search resukts
       
       
	}

}
