package bdd.slm.java.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import bdd.slm.java.Utils.ApplicationConstants;
import bdd.slm.java.Utils.VariableUtils;

public class GoogleHomePage {
	
	By txtSearch = By.name("q");
	By btnSearch = By.name("btnK");
	By btnLucky = By.name("btnI");
	
	public void setText(String searchText) {		
		VariableUtils.driver.findElement(txtSearch).sendKeys(searchText);
		VariableUtils.driver.findElement(txtSearch).sendKeys(Keys.ESCAPE);
	}

	public void clickSearchBtn() throws InterruptedException {		

		
		if (VariableUtils.driverType.contains(ApplicationConstants.CHROME_BROWSER))			
		VariableUtils.driver.findElement(btnSearch).sendKeys(Keys.RETURN);
		
		if (VariableUtils.driverType.contains(ApplicationConstants.FIREFOX_BROWSER))			
		VariableUtils.driver.findElement(btnSearch).click();
		
	}
	
	public void clickLuckyBtn() {		
		VariableUtils.driver.findElement(btnLucky).click();		
	}

}
