package bdd.slm.java.stepDefinition;

import cucumber.api.java.en.*;

public class StepDefinition {
	
	
	@Given("^I want to write a step with precondition$")
	public void precondition() {

		System.out.println("=========== hi ===========");
	}

}
