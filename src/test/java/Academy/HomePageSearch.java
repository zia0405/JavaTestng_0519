package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageSearch extends TestBase {

	@BeforeMethod
	public void initialize() throws IOException {

		driver = initializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
	}

	@Test(priority =1)

	public void SeleniiumSearch() throws IOException {

		LandingPage lp = new LandingPage(driver);
		// closing the newsletter pop-up
		lp.closeNewsletterPopup().click();
		lp.getLogin().click();
		LoginPage lp1 = new LoginPage(driver);
		lp1.enterUserName().sendKeys("malikzia964@gmail.com");
		lp1.enterPassword().sendKeys("Password-1");
		lp1.clickLoginButton().click();
		HomePage hm = new HomePage(driver);
		hm.getSearchBox().sendKeys("Selenium");
		hm.getSearchButton().click();

		try {

			if (hm.getSeleniumSearchRes().isDisplayed()) {

				System.out.println("Selenium search is successful.");

			}
			/*
			 * try { if(hm.getPythonSearchRes().isDisplayed()) {
			 * 
			 * System.out.println("Python search is successful.");
			 * 
			 * 
			 * } }
			 * 
			 * finally {
			 * 
			 * System.out.println("I will always execute");
			 */

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	public void seleniumCourseScreen() throws InterruptedException {

		LandingPage lp = new LandingPage(driver);
		// closing the newsletter pop-up
		lp.closeNewsletterPopup().click();
		lp.getLogin().click();
		LoginPage lp1 = new LoginPage(driver);
		lp1.enterUserName().sendKeys("malikzia964@gmail.com");
		lp1.enterPassword().sendKeys("Password-1");
		lp1.clickLoginButton().click();
		HomePage hm = new HomePage(driver);
		hm.getSearchBox().sendKeys("Selenium");
		hm.getSearchButton().click();
		hm.getSeleniumSearchRes().click();
		SeleniumCoursePage slc = new SeleniumCoursePage(driver);
		String actualMessage = slc.getMessage().getText();
		String expectedMessage = "Join with us! - \"Top Ranked Selenium Course in Internet with 2000+ students learning together with great collaboration";
        Assert.assertEquals(actualMessage, expectedMessage);
        slc.getEnrollButton().click();
        slc.getPlayButton().click();
      // System.out.println( driver.getTitle());
        //driver.wait(30);
	}

	@AfterMethod
	public void teardown() {

		driver.quit();
		driver = null;
	}

}
