/**
1) https://disneyworld.disney.go.com/tickets/
use this link to validate Add to cart functionality
 * 
 */
package Test_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author varaprasad
 *
 */

@Test
public class Naresh_week_verify {

	
	public void Naresh_week() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://disneyworld.disney.go.com/tickets/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Disney.Naresh_week exam = new Disney.Naresh_week(driver);
		exam.Number_Day();
		exam.Number_tickets();
		//exam.Number_park();
		
		
		

	}

}
