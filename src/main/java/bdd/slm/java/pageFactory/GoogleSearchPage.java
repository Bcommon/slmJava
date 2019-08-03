package bdd.slm.java.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import bdd.slm.java.Utils.VariableUtils;

public class GoogleSearchPage {
	
	VariableUtils vutils = new VariableUtils();

	By txtSearch = By.name("q");
	By firstSearchLink = By.xpath("//h3[@xpath=1]");	
	By nextLink = By.xpath("//span[text()='Next']/ancestor::a[1]");

	public String getSearchTxt() {
		return VariableUtils.driver.findElement(txtSearch).getAttribute("value");
	}

	public void setText(String searchText) {
		VariableUtils.driver.findElement(txtSearch).sendKeys(searchText);
		VariableUtils.driver.findElement(txtSearch).sendKeys(Keys.ESCAPE);
	}

	public String getFirstSearchLinkText(String searchText) {
		return VariableUtils.driver.findElement(firstSearchLink).getText();
	}

	public void clickNext() {
		VariableUtils.driver.findElement(nextLink).click();
	}

}
