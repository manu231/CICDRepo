package Examples_Manohar;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeliniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		  
		 URL u = new URL("http://192.168.1.24:4444/wd/hub");
		 
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setPlatform(Platform.WINDOWS);
		 cap.setBrowserName("firefox");
		 System.out.println("beforeRWD");
		 
		  WebDriver driver = new RemoteWebDriver(u,cap);
		  System.out.println("AfterRWD");
	      String url = "http://demo.automationtesting.in/WebTable.html";
	      driver.get(url);
	      
	    System.out.println("after url");
	      
	      driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a")).click();

	}

}
