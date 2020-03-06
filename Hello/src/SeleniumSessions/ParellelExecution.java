package SeleniumSessions;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelExecution {
	
	//First Session of WebDriver
	
	public String chrome = "webdriver.chrome.driver";
	public  String driverPath = "C:\\Selenium\\chromedriver.exe";
	public String url = "https://www.cleartrip.com/hotel";
	
	@Test
	public void executeSessionOne() {
		System.setProperty(chrome, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Session One");
	}
	@Test
	public void executeSessionTwo() {
		System.setProperty(chrome, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Session Two");
	}
	@Test
	public void executeSessionThree() {
		System.setProperty(chrome, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Session Three");
	}
	@Test
	public void executeSessionFour() {
		System.setProperty(chrome, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Session Four");
	}
	
	

}
