/*
*1)use this link to validate details of ticets are getting popualted in table properly or not
url:https://disneyworld.disney.go.com/tickets/water-parks/
2)under select your ticket option based on your selection .. details to releated to radio button should be selected*
 * 
 */
package Disney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author varaprasad
 *
 */

public class Week1_Exam {
	WebDriver driver;
	
	By Adults = By.xpath(".//*[@id='adultTotal-wrapper']/div[1]");
	By Childs = By.xpath(".//*[@id='childTotal-wrapper']/div[1]");
	By Oneday_ticket = By.xpath(".//*[@id='waterParksid-base']/div/span[1]/div");
	By Blocked_ticket = By.xpath(".//*[@id='waterParksid-base']/div/span[2]/div");
	
	
	

	public Week1_Exam(WebDriver driver) {

		this.driver=driver;
	}

	
	public void Adults(){
		
		driver.findElement(Adults).sendKeys("4");
		driver.findElement(Childs).sendKeys("4");
	}
	
	public void oneday_waterpark_ticket(){
		
		driver.findElement(Oneday_ticket).click();
	}
	
	public void Blocked_ticket(){
		
		driver.findElement(Blocked_ticket).click();
	}
	
}





