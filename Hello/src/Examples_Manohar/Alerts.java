package Examples_Manohar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alertWithText = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		alertWithText.click();
		
		//Click on Alert Button
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alertButton.click();
		
		// pop up alert box
		
		Alert a = driver.switchTo().alert();
		
		
		String message = a.getText();
		System.out.println("Alert box Message is---- " +message);
		
		
*/
		
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		
		// Switching to Alert
		
		Alert alert = driver.switchTo().alert();
		//Capturing Alert message
		String alertMessage = driver.switchTo().alert().getText();
		
		Thread.sleep(5000);
		//Accepting java Script Alert
		System.out.println("Alert Meaasge is : " +alertMessage);
		alert.accept();
	}

}
