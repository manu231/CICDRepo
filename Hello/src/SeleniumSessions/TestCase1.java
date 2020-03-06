package SeleniumSessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public  class TestCase1 {
	
	@BeforeTest
	public void CreatingDBConn() {
		System.out.println("Creating DB connection");
	}
	
	@AfterTest
	public void CloseDBConn() {
		System.out.println("Closing DB connection");
	}
	
	public void ClosingDBConn() {
		System.out.println("Closing DB connection");
	}
	@BeforeMethod()
	public void LaunchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Closing the Browser");
	}
	
	
    @Test(priority = 1)
    public void doLogin() {
    	System.out.println("Executing Login Test FIRST");
    }
    
    
    @Test(invocationCount = 0)
    public void doUserReg() {
    	System.out.println("Executing User Registration SECOND");
    }
    
    
    
    
}
