package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public static WebDriver driver;

	By loginLink = By.linkText("Login");
	By NewsletterPopup = By.xpath(
			"//div[@class='sumome-react-wysiwyg-component sumome-react-wysiwyg-outside-horizontal-resize-handles sumome-react-wysiwyg-outside-vertical-resize-handles sumome-react-wysiwyg-close-button sumome-react-wysiwyg-popup-image sumome-react-wysiwyg-image']//div[2]");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By contactLink = By.xpath("//a[contains(text(),'Contact')]");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement validateTitle() {

		return driver.findElement(title);
	}

	public WebElement getLogin() {

		return driver.findElement(loginLink);
	}

	public WebElement closeNewsletterPopup() {

		return driver.findElement(NewsletterPopup);
	}

	public WebElement contactValidate() {

		return driver.findElement(contactLink);
	}

}
