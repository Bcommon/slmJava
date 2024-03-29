package bdd.slm.java.stepDefinition;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import bdd.slm.java.Utils.ApplicationConstants;
import bdd.slm.java.Utils.ScreenShot;
import bdd.slm.java.Utils.VariableUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSeleniumPrg {

	File file;
	VariableUtils vutils = new VariableUtils();
	ScreenShot screenPrint = new ScreenShot();
	private Scenario scenario;

	// public WebDriver driverChrome;

	@Before
	public void startTest(Scenario scenario) {

		this.scenario = scenario;
		VariableUtils.screenShotCounter = 0;

	}

	@Given("^\"([^\"]*)\" available in the project path$")
	public void checkDriverFile(String webdriver) {

		file = new File(ApplicationConstants.DRIVER_PATH + webdriver.trim());

		vutils.message = "***** webdriver not available in project path : " + ApplicationConstants.DRIVER_PATH
				+ webdriver.trim() + " *****";

		assertTrue(vutils.message, file.exists());

		scenario.write("Full webdriver project path : " + ApplicationConstants.DRIVER_PATH + webdriver.trim());

		System.out.println("================ " + webdriver + " ================ ");

	}

	@Then("^get \"([^\"]*)\" for test$")
	public void getDriver(String webdriver) {
		if ("chromedriver.exe".equalsIgnoreCase(webdriver.trim())) {
			System.setProperty(ApplicationConstants.CHROME_PROPERTY,
					ApplicationConstants.DRIVER_PATH + webdriver.trim());
			VariableUtils.driver = new ChromeDriver();
			VariableUtils.driverType = "Chrome";
		} else if ("geckodriver.exe".equalsIgnoreCase(webdriver.trim())) {
			System.setProperty(ApplicationConstants.FIREFOX_PROPERTY,
					ApplicationConstants.DRIVER_PATH + webdriver.trim());
			VariableUtils.driver = new FirefoxDriver();
			VariableUtils.driverType = "Firefox";
		} else if ("msedgedriver.exe".equalsIgnoreCase(webdriver.trim())) {
			System.setProperty(ApplicationConstants.IE_DRIVER_PATH,
					ApplicationConstants.DRIVER_PATH + webdriver.trim());
			VariableUtils.driver = new InternetExplorerDriver();
			VariableUtils.driverType = "IE";
		} else {
			assertTrue(false, "*********** webdriver mismatch ***********");
		}

	}

	@Then("^launch driver with \"([^\"]*)\"$")
	public void launchURL(String url) {
		VariableUtils.driver.get(url);
		VariableUtils.driver.manage().window().maximize();
	}

	@When("^check \"([^\"]*)\" is launched$")
	public void checkURL(String url) throws Exception {

		scenario.write("CurrentUrl : " + VariableUtils.driver.getCurrentUrl());

		vutils.message = "****** URL mismatch ****";
		assertTrue(vutils.message, VariableUtils.driver.getCurrentUrl().trim().equalsIgnoreCase(url));
		screenPrint.takeSnapShot();

	}

	@After
	public void closeTest() throws InterruptedException {

		// File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		if (!(VariableUtils.driver == null)) {
			TimeUnit.SECONDS.sleep(1);
			VariableUtils.driver.quit();
		}
	}

}
