package Examples_Manohar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		String url = ("http://money.rediff.com/gainers/bsc/daily/groupa?");
		driver.get(url);
		
		// No of columns 
		//List<WebElement> col = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/div[2]"));
		List<WebElement> col = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No of columns are " +col.size());

		// No of columns 
		//List<WebElement> rows = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/div[2]"));
		List<WebElement> rows = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of Rows are " +rows.size());
		
		
		
		String url1 = ("https://www.cleartrip.com/hotel");
		driver.get(url1);
		driver.findElement(By.id("CheckInDate")).click();
		System.out.println("---------------------");
		
		// No of columns 
		//List<WebElement> col = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/div[2]"));
		List<WebElement> col1 = driver.findElements(By.xpath("//div[contains(@class,'monthBlock first')]//thead"));
		System.out.println("No of columns are " +col1.size());

		// No of columns 
		//List<WebElement> rows = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='leftcontainer']/div[2]"));
		List<WebElement> rows1 = driver.findElements(By.xpath("//div[contains(@class,'monthBlock first')]//th[3]"));
		System.out.println("No of rows are " +rows1.size());
	}

}
