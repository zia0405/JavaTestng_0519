package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  HomePage {

	public static WebDriver driver;

	By userIcon = By.xpath("//img[@class='gravatar']");
	By searchBox = By.xpath("//input[@id='search-courses']");
	By searchButton = By.xpath("//button[@id='search-course-button']");
	By seleniumSearchRes = By.xpath("//div[contains(text(),'(Basics+Advanced+Int')]");
	By pythonSearchRes = By.xpath("//div[@class='course-listing-title']");

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement UserIconDisplay() {

		return driver.findElement(userIcon);
	}

	public WebElement getSearchBox() {

		return driver.findElement(searchBox);
	}

	public WebElement getSearchButton() {

		return driver.findElement(searchButton);
	}

	public WebElement getSeleniumSearchRes() {

		return driver.findElement(seleniumSearchRes);
	}
	
	public WebElement getPythonSearchRes() {

		return driver.findElement(pythonSearchRes);
	}

}
