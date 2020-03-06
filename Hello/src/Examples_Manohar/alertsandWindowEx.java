package Examples_Manohar;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsandWindowEx {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.automationtesting.in/Alerts.html");

		/*driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println("text on alert " + a.getText());
		
		//a.sendKeys("hello");
		//a.dismiss();
		
		//a.accept();*/
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		Set<String> s = driver.getWindowHandles();
		/*Iterator i = s.iterator();
		while(i.hasNext())
		{
			String title = driver.getTitle();
			String t = i.next().toString();
			if(title.contains("Sakinalium"))
			{
				System.out.println("inside value");
			*/
		int i=0;
		for (String s1 : s)
		//Object[] s1 = s.toArray();
		for(i=0;i<s.size();i++)
		{
			//String s2 = s1[i].toString();
			driver.switchTo().window(s1);
			String title = driver.getTitle();
				if(title.contains("Sakinalium"))
						driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a[contains(text(),'Contact')]")).click();
			
		}
	}

}
