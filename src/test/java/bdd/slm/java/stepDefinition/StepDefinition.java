package bdd.slm.java.stepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import bdd.slm.java.Utils.ScreenShot;
import bdd.slm.java.Utils.VariableUtils;
import bdd.slm.java.pageFactory.GoogleHomePage;
import bdd.slm.java.pageFactory.GoogleSearchPage;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class StepDefinition {

	VariableUtils vutils = new VariableUtils();
	private Scenario scenario;
	ScreenShot screenPrint = new ScreenShot();
	GoogleHomePage googleHmPg = new GoogleHomePage();
	GoogleSearchPage googleSchPg = new GoogleSearchPage();

	@Before
	public void startTest(Scenario scenario) {

		this.scenario = scenario;
		VariableUtils.screenShotCounter = 0;

	}

	@Given("^get webdriver for \"([^\"]*)\" with \"([^\"]*)\"$")
	public void getWebdriver(String driverType, String url) throws Exception {

		VariableUtils.driverType = driverType;
		vutils.message = "***** WebDriver object not created *****";
		assertTrue(vutils.message, VariableUtils.setDriver());
		vutils.message = driverType + ":::  created";
		scenario.write(vutils.message);
		VariableUtils.driver.get(url);
		vutils.message = "***** url navigation failed *****";
		assertTrue(vutils.message, VariableUtils.driver.getCurrentUrl().toString().trim().equalsIgnoreCase(url.trim()));
		VariableUtils.driver.manage().window().maximize();
		VariableUtils.screenShotPage = "GoogleHomePage_";
		screenPrint.takeSnapShot();
		vutils.message = "::: navigated url :::\n" + url;
		scenario.write(vutils.message);
	}

	@Then("^type search text in text box and \"([^\"]*)\"$")
	public void googleSearch(String text) throws Exception {

		googleHmPg.setText(text);
		TimeUnit.SECONDS.sleep(1);
		screenPrint.takeSnapShot();
		googleHmPg.clickSearchBtn();

		vutils.message = "***** searching failed *****";
		vutils.flag = VariableUtils.driver.getCurrentUrl().toString().contains("&q=" + text.trim());
		assertTrue(vutils.message, vutils.flag);

		vutils.message = "::: navigated url :::\n" + VariableUtils.driver.getCurrentUrl().toString() + "\n";
		scenario.write(vutils.message);
		
		VariableUtils.screenShotPage = "GoogleSearchPage_";
		screenPrint.takeSnapShot();
	}

	@When("^verify the search result \"([^\"]*)\"$")
	public void verifySearchResult(String text) throws Exception {
		vutils.message = "::: Search Text :::\n" + googleSchPg.getSearchTxt();
		scenario.write(vutils.message);
		
		vutils.message = "***** Search Text mismatch *****";
		assertTrue(vutils.message, googleSchPg.getSearchTxt().trim().equalsIgnoreCase(text.trim()));
		
		TimeUnit.SECONDS.sleep(1);
		VariableUtils.screenShotPage = "GoogleSearchPage_";
		screenPrint.takeSnapShot();
	}

}
