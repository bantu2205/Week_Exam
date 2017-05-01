/**
 * 
 */
package Test_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Disney.Week1_Exam;

/**
 * @author varaprasad
 *
 */
@Test
public class Week1_verify {
	

		public static void Click(){
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://disneyworld.disney.go.com/tickets/water-parks/");
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			Week1_Exam exam = new Week1_Exam(driver);
			exam.Adults();
			//exam.Blocked_ticket();
			exam.oneday_waterpark_ticket();
		}

}
