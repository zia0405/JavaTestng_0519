package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCoursePage {

	public static WebDriver driver;

	public SeleniumCoursePage(WebDriver driver) {

		this.driver = driver;
	}

	By message = By.xpath("//h2[@class='course-subtitle']");
	By enrollButton = By.xpath("//a[@id='watchpromo']");
	By playButton = By.xpath(
			"//body[@class='modal-open']/div[@class='view-school']/div[@id='blocks-page-172812']/div[@id='block-158845']/div[@id='promoModal']/div[@class='modal-body']/div[@class='row']/div[@class='col-md-8 col-md-offset-2 course-splash-media video']/div[@id='wistia-huhiap3zcd']/div[@id='wistia_chrome_25']/div[@id='wistia_grid_31_wrapper']/div[@id='wistia_grid_31_main']/div[@id='wistia_grid_31_center']/div[@class='w-ui-container']/div[@id='w-vulcan-v2-30']/div[@class='w-vulcan-overlays-table w-css-reset']/div[@class='w-vulcan-overlays--center w-css-reset']/div[@class='w-css-reset']/div[@class='w-css-reset']/div[@class='w-bpb-wrapper w-css-reset w-css-reset-tree']/button[@class='w-big-play-button w-css-reset-button-important w-vulcan-v2-button']/*[1]");

	public WebElement getMessage() {

		return driver.findElement(message);
	}

	public WebElement getEnrollButton() {

		return driver.findElement(enrollButton);
	}
	
	public WebElement getPlayButton() {

		return driver.findElement(playButton);
	}

}
