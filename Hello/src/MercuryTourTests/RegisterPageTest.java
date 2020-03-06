package MercuryTourTests;

import org.openqa.selenium.WebDriver;

import MercuryTourPages.RegisterPage;

public class RegisterPageTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver ", "C:\\Selenium_Lankesh\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");

		//create the objects of each page
		RegisterPage rpo = new RegisterPage(driver);

		//methods for each object to perform test step action
		rpo.fname_enterText("name", "firstName", "manohar");
		rpo.lname_enterText("name", "lastName", "chillara");
		rpo.phone_enterText("name", "phone", "123456");
		rpo.email_enterText("name", "userName", "chillara@gmail.com");
		rpo.address1_enterText("name", "address1", "81-60");
		rpo.address2_enterText("name", "address2", "267th Street");
		rpo.city_enterText("name", "city", "Glen Oaks");
		rpo.state_enterText("name", "state", "NY");
		rpo.postal_enterText("name", "postalCode", "54321");
		rpo.postal_enterText("name", "country", "INDIA");

		   //rpo.country_enterText("id", "email", "chillara"); //*[@id="email"]
		//rpo.country_enterText("xpath", " //*[@id=\"email\"]", "chillara");

		rpo.password_enterText("name", "password", "chillara1");
		rpo.confirm_enterText("name", "confirmPassword", "chillara1");
		//rpo.submit_Click("name", "register");


	}

}
