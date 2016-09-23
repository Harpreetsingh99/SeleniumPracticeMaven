package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FacebookLoginPage {
	
	public WebElement getFbUserNameField(WebDriver driver)
	{
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getFbPasswordField(WebDriver driver)
	{
		return driver.findElement(By.id("pass"));
	}
	
}
