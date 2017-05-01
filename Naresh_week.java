/*
 * 1) https://disneyworld.disney.go.com/tickets/
use this link to validate Add to cart functionality
 * 
 * */
package Disney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Naresh_week {
	WebDriver driver;
	By Number_Day = By.xpath(".//*[@id='pepDayScroller_numDays']/div[5]/a/div[2]");
	By Number_tickets = By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]");
	By Number_Increase = By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]");
	By Number_park = By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[1]");
	By Number_add = By.xpath(".//*[@id='addToCart']");

	public Naresh_week(WebDriver driver) {

		this.driver=driver;
	}

public void Number_Day(){
	
	driver.findElement(Number_Day).click();
}

public void Number_tickets() throws InterruptedException{
	
	driver.findElement(Number_tickets).click();
	Thread.sleep(5000);
	driver.findElement(Number_Increase).click();
	Thread.sleep(5000);
	driver.findElement(Number_park).click();
	driver.findElement(Number_add).click();

	
	

}

}
