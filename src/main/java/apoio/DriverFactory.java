package apoio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
//				System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\83\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://phptravels.net/admin/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
 
}
