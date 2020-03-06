package JavaSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println("Hello World");

	}

}
