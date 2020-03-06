package SeleniumSessions;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCaseNG2 {
	
	@Test(priority = 1)
	public void validate_titles() {
		String expectedTitle ="yahoo.com";
		String actual_title = "google.com";
		Assert.assertEquals(actual_title, expectedTitle);
		//Assert.fail("Failed because no element found");
		//Assert.fail();
		System.out.println("Statement after Assert FAIL");
	}
	
	//SoftAsserts -- We can still continue test
	@Test
	public void c_test() {
		Assert.fail();
		System.out.println("C_TEST");
	}
	@Test
	public void b_test() {
		Assert.assertTrue(true);
		System.out.println("b_TestL");
	}

}
