package Examples_Manohar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	//String dot="9/October/2018";
	String date,month;
	String caldt,calmonth;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/hotel");
		driver.findElement(By.id("CheckInDate")).click();
		
		WebElement cal;
		String calyear;
		cal=driver.findElement(By.className("calendar"));
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
        System.out.println("Calenday Year is "+calyear);
        
        // To locate table
        WebElement myTable = driver.findElement(By.xpath("//div[@id='ui-datepicker-div'+-]"));
      
        
        //To locate rows of a table
        List<WebElement> rows_table = myTable.findElements(By.tagName("td"));
        //To calculate  no of rows in a table
        int rows_count = rows_table.size();
        System.out.println("ROWS COUNT IS: " +rows_count );
        
        //Loop will execute till the last row of the Table
        
        for(int row = 0; row<rows_count; row++) {
        	List<WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
        	// To calculate no of columns(cells) in that specific row
        	int columns_count = columns_row.size();
        	System.out.println(" Number of cells in row "+row+ " are " +columns_count);
        	
        	// Loop will execute till the last cell of that specific row
        	  
        	   for(int column = 0; column<columns_count;column++) {
        		   
        		   //To retreive text from that specific cell
        		   
        		   String celText = columns_row.get(column).getText();
        		   System.out.println("Cell value of row number " +row+ " and column number " +column+ "Is " +celText);;
        	   }
        	   /
        	
        	System.out.println("----------------------------------------------");
        }
	}

}
