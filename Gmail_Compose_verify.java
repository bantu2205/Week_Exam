package Disney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail_Compose_verify {
	
	WebDriver driver;
	
	By Email = By.xpath(".//*[@id='Email']");
	By pwd =  By.xpath(".//*[@id='Passwd']");
	By next = By.xpath(".//*[@id='next']");
	By singin = By.xpath(".//*[@id='singIn']");
	By compose = By.xpath(".//*[@id=':ha']/div/div[text()='COMPOSE']");
	By Attachment = By.xpath(".//*[@id=':2hd']");
	
	public Gmail_Compose_verify(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public void email(){
		
		driver.findElement(Email).sendKeys("bantu.qa@gmail.com");
		driver.findElement(next).click();
	}
	
	public void password(){
		
		driver.findElement(pwd).sendKeys("kpcl123$");
	}
	
	public void signin(){
		
		driver.findElement(singin).click();
	}
	
	public void compose(){
		
		driver.findElement(compose).click();
		driver.findElement(Attachment).click();
	}
	
	
}
