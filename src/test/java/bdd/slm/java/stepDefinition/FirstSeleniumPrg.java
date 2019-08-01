package bdd.slm.java.stepDefinition;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import bdd.slm.java.Utils.ApplicationConstants;
import bdd.slm.java.Utils.VariableUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class FirstSeleniumPrg {

	public WebDriver driver;
	File file;
	VariableUtils vutils = new VariableUtils();
	private Scenario scenario;

	// public WebDriver driverChrome;

	@Before
	public void startTest(Scenario scenario) {
		System.out.println("================ @Before ================ ");
		this.scenario = scenario;

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
			driver = new ChromeDriver();
		} else if ("geckodriver.exe".equalsIgnoreCase(webdriver.trim())) {
			System.setProperty(ApplicationConstants.FIREFOX_PROPERTY,
					ApplicationConstants.DRIVER_PATH + webdriver.trim());
			driver = new FirefoxDriver();
		} else {
			assertTrue(false, "*********** webdriver mismatch ***********");
		}

	}

	@Then("^launch driver with \"([^\"]*)\"$")
	public void launchURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("^check \"([^\"]*)\" is launched$")
	public void checkURL(String url) {

		scenario.write("CurrentUrl : " + driver.getCurrentUrl());

		vutils.message = "****** URL mismatch ****";
		assertTrue(vutils.message, driver.getCurrentUrl().trim().equalsIgnoreCase(url));

	}

	@After
	public void closeTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		driver.quit();
	}

}
