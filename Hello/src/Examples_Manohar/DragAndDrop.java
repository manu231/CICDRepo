package Examples_Manohar;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		String driverExecutablePath =  "C:\\Selenium\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Static.html ");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//By interactions = By.xpath("//a[contains(text(),'Interactions')]");
		//WebElement interactionsClick = driver.findElement(interactions);
		//interactionsClick.click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		By dragAndDrop = By.xpath("//a[contains(text(),'Drag and Drop')]");
		WebElement dragAndDropClick = driver.findElement(dragAndDrop);
		//dragAndDropClick.click();
		
		//Element which needs to be dragged
		
		WebElement from = driver.findElement(By.xpath("//img[@id='angular']"));
		
		// Element which needs to be dropped
		WebElement to = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		
		Actions act = new Actions(driver);
		// Dragged and Dropped
		Action a = act.contextClick(to).build();
		
		a.perform();
		
		
	//	Assert.fail("this is sample without testng");
		
		

	}

}
