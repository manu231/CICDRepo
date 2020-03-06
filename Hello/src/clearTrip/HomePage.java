package clearTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//This class is written for identifying objects using reusable methods, reusable actions
// The constructor is written to initialize local WebDriver

public class HomePage 
{
	static WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	static WebElement OneWay, RoundTrip, MultiCity;
	
	public static void oneWay()
	{
		OneWay = driver.findElement(By.id("OneWay"));
	}
	
	public void oneWay_Click()
	{
		oneWay();
		OneWay.click();
	}

	public static void roundTrip()
	{
		RoundTrip = driver.findElement(By.id("RoundTrip"));
	}
	
	public void roundTrip_Click()
	{
		roundTrip();
		RoundTrip.click();
	}
	
	public static void multiCity()
	{
		MultiCity = driver.findElement(By.id("MultiCity"));
	}
	
	public void multiCity_Click()
	{
		multiCity();
		MultiCity.click();
	}

	static WebElement from, to;
	
	public static void fromText()
	{
		from = driver.findElement(By.id("FromTag"));
	}

	public void fromEnterText(String str)
	{
		fromText();
		from.sendKeys(str);
	}
	
	public static void toText()
	{
		to = driver.findElement(By.id("ToTag"));
	}
	public void toText(String str)
	{
		toText();
		to.sendKeys(str);
	}
	
	static WebElement depart;
	
	public static void depart()
	{
		depart = driver.findElement(By.xpath("//input[@id='DepartDate']"));
	}
	
	public static void departText(String str)
	{
		depart();
		depart.sendKeys(str);
		OneWay.click();
	}
	
	static WebElement adult, children, infant;
	public static void adults()
	{
		adult = driver.findElement(By.name("adults"));
	}
	public void adultSelect(int val)
	{
		adults();
		Select s = new Select(adult);
		s.selectByIndex(val);
	}
	
	public static void children()
	{
		children = driver.findElement(By.name("childs"));
	}
	public void childrenSelect(String val)
	{
		children();
		Select s = new Select(children);
		s.selectByValue(val);
	}
	
	public static void infant()
	{
		infant = driver.findElement(By.name("infants"));
	}
	public void infantSelect(String val)
	{
		infant();
		Select s = new Select(adult);
		s.selectByValue(val);
	}
	
	static WebElement search;
	
	public static void search()
	{
		search = driver.findElement(By.id("SearchBtn"));
	}
	
	public void searchClick()
	{
		search();
		search.click();
	}
}
