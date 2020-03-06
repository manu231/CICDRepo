package clearTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotels {

	static WebDriver driver;
	public  SearchHotels(WebDriver driver) {
		this.driver = driver;
	}

static WebElement where, checkin,checkout, travellers,dtPickerIn,dtPickerOut;
	
	public static void whereText()
	{
		where = driver.findElement(By.name("from"));
	}

	public void whereEnterText(String str)
	{
		whereText();
		where.sendKeys(str);
	}
	
	public static void checkIn()
	{
		//checkin = driver.findElement(By.xpath("//input[@id='CheckInDate']']"));
		checkin = driver.findElement(By.id("CheckInDate"));
		
	}
	
	public static void checkInText()
	{
		checkIn();
		checkin.click();
	}
	
	 public static void dtPickerIn( ) {
		dtPickerIn =  driver.findElement(By.xpath(" //a[contains(@class,'ui-state-default ui-state-active')]"));
	} 
	
	public static void dtPickerInText(String str) {
		dtPickerIn();
		dtPickerIn.sendKeys(str);
	} 
	
	public static void checkOut()
	{   
		checkout = driver.findElement(By.xpath("//input[@id='CheckOutDate']"));
	    
	}
	
	public static void checkOutText()
	{
		checkOut();
		checkout.click();
		//checkout.sendKeys(str);
		
	}
	
	public static void travelers()
	{
		travellers = driver.findElement(By.xpath("//select[@id='travellersOnhome']"));
	}
	public void travelersSelect(int val)
	{
		travelers();
		Select s = new Select(travellers);
		s.selectByIndex(val);
	}
	
	
	
	
	

}
