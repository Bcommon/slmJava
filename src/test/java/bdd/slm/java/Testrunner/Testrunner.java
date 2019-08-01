package bdd.slm.java.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/feature/bdd/slm/java/webtest", glue = {
		"bdd/slm/java/stepDefinition" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json" }, tags = { "@somkeTestDriver" })

public class Testrunner {

}
