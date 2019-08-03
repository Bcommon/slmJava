package bdd.slm.java.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class VariableUtils {

	public static WebDriver driver = null;

	public String message = "";
	public boolean flag = false;
	public String screenShotName = "";
	public String screenShotPath = "";
	public static String driverType = "";
	public static String screenShotPage = "";
	public static int screenShotCounter = 0;

	public static boolean setDriver() {

		if (ApplicationConstants.CHROME_BROWSER.equalsIgnoreCase(driverType.trim())) {

			System.setProperty(ApplicationConstants.CHROME_PROPERTY,
					ApplicationConstants.DRIVER_PATH + "chromedriver.exe");
			VariableUtils.driver = new ChromeDriver();

			return true;
		} else if (ApplicationConstants.FIREFOX_BROWSER.equalsIgnoreCase(driverType.trim())) {

			System.setProperty(ApplicationConstants.FIREFOX_PROPERTY,
					ApplicationConstants.DRIVER_PATH + "geckodriver.exe");
			VariableUtils.driver = new FirefoxDriver();
			return true;

		} else if (ApplicationConstants.IE_BROWSER.equalsIgnoreCase(driverType.trim())) {

			System.setProperty(ApplicationConstants.IE_DRIVER_PATH,
					ApplicationConstants.DRIVER_PATH + "MicrosoftWebDriver.exe");
			VariableUtils.driver = new InternetExplorerDriver();
			return true;

		} else {
			return false;
		}

	}

}
