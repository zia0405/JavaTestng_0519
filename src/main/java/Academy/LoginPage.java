package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebDriver driver;

	By userName = By.id("user_email");
	By password = By.id("user_password");
	By loginButton =By.xpath("//input[@type ='submit']");
	By validationMessage = By.xpath("//div[@class='alert alert-danger']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement enterUserName() {

		return driver.findElement(userName);
	}

	public WebElement enterPassword() {

		return driver.findElement(password);
	}
	
	public WebElement clickLoginButton() {
		
		return driver.findElement(loginButton);
	}
	
	public WebElement printValidationMessage() {
		
		return driver.findElement(validationMessage);
	}

}
