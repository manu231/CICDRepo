package Examples_Manohar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesTesting {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();

	      String url = "http://demo.automationtesting.in/WebTable.html";
	      driver.get(url);
	      
	      // Verify Email
	  	By email = By.xpath("//div[contains(text(),'jaghanathankp@gmail.com')]");
	  	String emailText = driver.findElement(email).getText();
	  	System.out.println(emailText);
	  	
	  	//Verify First Name
	  	String actulFirstName = "Jaghanathan";
	  	By firstname = By.xpath("//div[contains(text(),'Jaghanathan')] ");
	  	String verifiedFirstName = driver.findElement(firstname).getText();
	  	System.out.println(verifiedFirstName);
	  	
	  	if (verifiedFirstName.equalsIgnoreCase(actulFirstName)) {
	  		System.out.println("Success  " +verifiedFirstName);
	  	}
	  	else {
	  		System.out.println("Not Success  " + actulFirstName );
	  	}
		
	  	// click on SwitchTo
	  	
	  	By switchloc = By.xpath("//a[contains(text(),'SwitchTo')]");
	  	WebElement switchlocbtn = driver.findElement(switchloc);
	  	switchlocbtn.click();
	  	
	  
	  	
       // click on Alert
	  	
	  	By alertloc = By.xpath("//a[contains(text(),'Alerts')]");
	  	WebElement alertbtn = driver.findElement(alertloc);
	  	alertbtn.click();
	  	
	  	By alertsWithOk = By.xpath(" //a[contains(text(),'Alert with OK & Cancel')]");
	  	WebElement alertsOK = driver.findElement(alertsWithOk);
	  	alertsOK.click();
	  	
	  	By alertOKCancel = By.xpath("//button[@class='btn btn-primary'] ");
	  	String alertOKCancelText = driver.findElement(alertOKCancel).getText();
	  	System.out.println(alertOKCancelText);
	  	
	  	// Click on Widgets
	  //a[contains(text(),'Widgets')]
	  	By widgets = By.xpath("//a[contains(text(),'Widgets')]");
	  	WebElement widgetsClick = driver.findElement(widgets);
	  	widgetsClick.click();
	  	
	  	By accordin = By.xpath("//a[contains(text(),'Accordion')]");
	  	WebElement accordinClick = driver.findElement(accordin);
	  	accordinClick.click();
	  	
	  //b[contains(text(),'Collapsible Group 2 - Single Line Coding')]
	  	
	  	By singleLink = By.xpath("//b[contains(text(),'Collapsible Group 2 - Single Line Coding')]");
	  	WebElement singleLinkClick = driver.findElement(singleLink);
	  	singleLinkClick.click();
	  	
	  	By singleLinkText = By.xpath("//div[contains(text(),'In this Automation tool, each and every functional')]");
	  	String singleLinkReadText = driver.findElement(singleLinkText).getText();
	  	
	  	System.out.println(singleLinkReadText);
	  	
	  //div[contains(text(),'In this Automation tool, each and every functional')]
	  	//driver.quit();
	  	
	  	
	}

}
