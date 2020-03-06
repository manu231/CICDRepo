package SeleniumSessions;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGSoftAssertion {

	@Test(invocationCount = 4)
	 public void doLogin() {
		System.out.println("Login Failed");
		Assert.fail();
		System.out.println("Login again Failed");
		 
	 }
}
