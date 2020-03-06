package SeleniumSessions;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	@Test
	@Parameters("browser")
	public void parameterizedtest (String browser) {
		if(browser.contentEquals("firefox")) {
			System.out.println("FIREFOX");
		} else {
			System.out.println("CHROME");
		}
	}

}
