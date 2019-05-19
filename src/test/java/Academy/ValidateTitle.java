package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateTitle extends TestBase {
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		
	}

	@Test
	public void NavigateToHomePage() throws IOException {

		
		String Title = driver.getTitle();
		System.out.println("The title of the page is : " + Title);
		LandingPage lnpg = new LandingPage(driver);
		lnpg.closeNewsletterPopup().click();
		Assert.assertEquals(lnpg.validateTitle().getText(),"FEATURED COUR12SES");
		Assert.assertTrue(lnpg.contactValidate().isDisplayed());
		System.out.println(!lnpg.contactValidate().isDisplayed());
		

	}
	
	@AfterMethod
	public void teardown() { 
		
		driver.quit();
		driver = null;
	}

}
