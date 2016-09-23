package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.FacebookLoginPage;

public class MainTest {

	
	@Test
	 public void login() {
		  	WebDriver driver = new FirefoxDriver();
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			FacebookLoginPage fb = new FacebookLoginPage();
			WebElement element = fb.getFbUserNameField(driver);
			element.sendKeys("abhi");
			WebElement element2 = fb.getFbPasswordField(driver);
			element2.sendKeys("78734");
			driver.close();
	  }
}
