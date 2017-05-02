package Test_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Disney.Gmail_Compose_verify;


public class Gmail_Compose {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/?tab=wm#inbox");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Gmail_Compose_verify test = new Gmail_Compose_verify(driver);
		test.email();
		test.password();
		test.signin();
		test.compose();
	}

}
