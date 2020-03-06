package Examples_Manohar;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {
	static String driverExecutablePath;

	public static void main(String[] args) throws IOException {
		
		excelReadWrite xl = new excelReadWrite();
		
		xl.setExcelFile("C:\\Selenium\\Demotours-PagesElements.xlsx", "Constants");
		
		driverExecutablePath =  xl.getCellValue(1, 1);
		
		//System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		
		
		WebDriver driver;
		driver = setupBrowser(xl.getCellValue(2, 1));
		
		driver.get(xl.getCellValue(3, 1));
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(dropdown);
		//select.selectByIndex(5);
		select.deselectByVisibleText("Eesti");
		
		// Selecting multiple Elements
		
	}
	
	
	public static WebDriver setupBrowser(String browser)
	{
		String str = null;
		WebDriver driver;// = null;
		switch(browser)
		{
		case "chrome":
			str = driverExecutablePath + "chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", str);
			driver = new ChromeDriver();
			
			break;
		case "firefox":
			str = driverExecutablePath + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", str);
			driver = new FirefoxDriver();
			
			break;
		case "IE":
			str = driverExecutablePath + "edgedriver.exe";
			System.setProperty("webdriver.ie.driver", str);
			driver = new InternetExplorerDriver();
			
			break;
		default:
			str = driverExecutablePath + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", str);
			driver = new FirefoxDriver();
			break;	
		}
		
		return driver;
	
	}

}
