package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		 prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Zia\\E2EProject_051719\\src\\main\\java\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		//System.out.println(browserName + " browser has launched successfully.");

		if (browserName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Executables\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(browserName + " browser has launched successfully.");
			// driver.get("https://google.com");
			// System.out.println(driver.getTitle());
		}
		if (browserName.equals("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			//driver.get("https://google.com");
		}

		if (browserName.equals("IE")) {

			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://google.com");
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}
	
	public void getScreenshots( String str) throws IOException {
		
		File src =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//" + str+ "screenshot.png"));
	}
}
