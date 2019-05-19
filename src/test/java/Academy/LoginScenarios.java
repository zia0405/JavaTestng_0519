package Academy;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginScenarios extends TestBase {
	
	@BeforeMethod
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		LandingPage lndpg = new LandingPage(driver);
		lndpg.closeNewsletterPopup().click();
		lndpg.getLogin().click();
		
	}

	@Test(dataProvider = "parameterize")
	public void NavigateToHomePage(String userName, String Password, String gentext) throws IOException {

		/*String Title = driver.getTitle();
		//System.out.println("The title of the page is : " + Title);
		/*LandingPage lndpg = new LandingPage(driver);
		lndpg.closeNewsletterPopup().click();
		lndpg.getLogin().click();*/
		//System.out.println("The title of the page is : " + Title);
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName().sendKeys(userName);
		lp.enterPassword().sendKeys(Password);
		lp.clickLoginButton().click();
		HomePage hm = new HomePage(driver);
		try {
			if (hm.UserIconDisplay().isDisplayed()) {

				System.out.println("user Logged in successfully.");
			}

		}

		catch (Exception e) {
            
			
			
			System.out.println("user login failed.");
			String validation = lp.printValidationMessage().getText();
			System.out.println("Validation Message is : " + validation);
			//e.printStackTrace();
		}
		
		

	}

	@DataProvider
	public Object[][] parameterize() {

		Object[][] data = new Object[3][3];

		data[0][0] = "malikzia964@gmail.com";
		data[0][1] = "Password-1";
		data[0][2] = "User should be able to login Successful.";

		data[1][0] = "malikzia964@gmail.com";
		data[1][1] = "Passwdddord-1";
		data[1][2] = "User should not be able to login Successful.";

		data[2][0] = "gghjhgj@gmail.co.com";
		data[2][1] = "Password-1";
		data[2][2] = "User should not be able to login Successful.";

		return data;

	}
	
	@AfterMethod
	public void teardown() { 
		
		driver.quit();
		driver = null;
	}

}
