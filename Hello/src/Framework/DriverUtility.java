package Framework;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility 
{
	static WebDriver driver;
	public DriverUtility(WebDriver driver)
	{
		this.driver = driver;
	}

	public static WebDriver setupBrowser(String browser, String url)
	{
		WebDriver driver=null;
		
		switch (browser)
		{
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new FirefoxDriver();
		}
		driver.get(url);
		return driver;
	}
	
	public static void shutBrowser()
	{
		driver.quit();
		System.out.println("browser is closed");
	}
	
	public static String getBrowserInfo(String str)
	{
		String info = null;
		switch (str)
		{
		case "title":
			str = driver.getTitle();
			break;
		case "url":
			str = driver.getCurrentUrl();
			break;
		case "code":
			str = driver.getPageSource();
			break;
			default:
				str = null;
			
		}
		
		return info;
	}
	
	public void browser_ops(String str)
	{
		switch(str)
		{
		case "maximize":
			driver.manage().window().maximize();
			break;
		case "fullscreen":
			driver.manage().window().fullscreen();
			break;
		case "refresh":
			driver.navigate().refresh();
			break;
		case "forward":
			driver.navigate().forward();
			break;
		case "back":
			driver.navigate().back();
			break;
		}
	}
	
	public static Dimension getWindowSize()
	{
		Dimension d = driver.manage().window().getSize();
		return d;
	}
	
	public static Point getPosition()
	{
		Point p = driver.manage().window().getPosition();
		return p;
	}
	
	public static void resizeWindow(Dimension d)
	{
		driver.manage().window().setSize(d);
	}
	
	public static void rePosition(Point p)
	{
		driver.manage().window().setPosition(p);
	}
	
	
	
	
}
