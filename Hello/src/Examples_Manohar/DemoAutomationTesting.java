package Examples_Manohar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DemoAutomationTesting {

	public static void main(String[] args) {
      
	  //String driverExecutablePath =  "C:\\Selenium\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		
	   //System.setProperty("webdriver.gecko.driver", "C:\\Users\\SeleniumDrivers\\geckodriver.exe");
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  
	 WebDriver driver = new ChromeDriver();
      
      //WebDriver driver = new FirefoxDriver();
      String url = "http://demo.automationtesting.in/";
      driver.get(url);
      
      // Verify Url
      String actualUrl = driver.getCurrentUrl();
      
      if (actualUrl.equals(url)  ) {
    	  System.out.println( "Verification Successful - Correct Url is opened :---->" +actualUrl );
    	  
      }
      else {
    	  System.out.println( "Verification Failed - An incorrect Url is opened :---->" +actualUrl );
      }
      
      // step 2  Enter email
  	By userID = By.id("email");
  	WebElement emailText = driver.findElement(userID);
  	emailText.sendKeys(" chillara.rao@gmail.com");
       	
  	By enter = By.id("enterimg");
  	WebElement enterText = driver.findElement(enter);
  	enterText.click();
  	//First Name
  	By first = By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input");
  	WebElement firstName = driver.findElement(first);
  	firstName.sendKeys("Manohar");

  	//Last Name
  	By last = By.xpath("//input[@placeholder='Last Name']");
  	WebElement lastName = driver.findElement(last);
  	lastName.sendKeys("Chillara");
  	
  	//Address
  	By address = By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']");
  	WebElement addressText = driver.findElement(address);
  	addressText.sendKeys( "Glen Oaks, NY");
  	
  	//Email
  	By email = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required'] ");
  	WebElement emailTest = driver.findElement(email );
  	emailTest.sendKeys("chillara.rao@gmail.com ");
  	
  	// Phone
  	By phone = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']");
  	WebElement phoneText = driver.findElement(phone);	
  	phoneText.sendKeys("646-321-0959");
    
  	
  	By maleLoc = By.xpath("//label[1]//input[1]");
  	WebElement Male = driver.findElement(maleLoc);
  	Male.click();
  	
  	By cricketLoc = By.id("checkbox1");
  	WebElement cricket = driver.findElement(cricketLoc);
  	cricket.click();
  	
  	//Languages
  	By languages = By.xpath("//*[@id=\"msdd\"]");
  	
  	//By languages = By.id("msdd");
  	WebElement languagesText = driver.findElement(languages);
  	languagesText.click();
  	
  	WebElement languageEnglish = driver.findElement(By.xpath("//a[contains(text(),'Ukrainian')]"));
  	languageEnglish.click();
  	
  	
  	//Skills
  	
  	/*By skillsLoc = By.id("Skills");
  	WebElement skills = driver.findElement(skillsLoc);
  	Select s1 = new Select(skills);
  	s1.selectByVisibleText("Design");
  	*/
  	cricket.click();
  	
  	By countryLoc = By.id("countries");
  	WebElement country = driver.findElement(countryLoc);
  	country.click();
  	
  	Select s = new Select(country);
  	s.selectByVisibleText("India");
  	
  //Select Country
  	//select2-country-container
  	//By ccountrySelect = By.xpath("//span[@class='select2-selection select2-selection--single']");
  	
  	//driver.switchTo().frame(driver.findElement(By.name("google_osd_static_frame")));
  	
  	
  	cricket.click();
  	By country1 = By.xpath("//span[@class='select2-selection select2-selection--single']");
  	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	WebElement countryText = driver.findElement(country1);
  	countryText.click();
  
  	WebElement denmark =driver.findElement(By.xpath("//li[contains(text(),'Denmark')]"));
  	denmark.click();
  	
  	/*Select s2 = new Select(countryText);
  	s2.selectByVisibleText("Japan");
  	*/
  	
  	//Password
  	
  	By passWord = By.id(" firstpassword");
  	WebElement passWordText = driver.findElement(passWord);
  	passWordText.sendKeys("Chillara@2020");
  	
  	By passWord1 = By.id(" secondpassword");
  	WebElement passWordText1 = driver.findElement(passWord1);
  	passWordText1.sendKeys("Chillara@2020");

   String currentUrl = driver.getCurrentUrl();
     // Submit
  	
  	By submit = By.id("submitbtn");
  	WebElement submitText = driver.findElement(submit);
  	submitText.click();
      

	}

}
