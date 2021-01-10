package com.qa.stepDefinations;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Setup;

public class CucumberTestStepDefination extends Setup {

	@Given("^The application URL is launched$")
	public void launchFacebook() {
		Setup.openBrowser();
	}

	@When("^Various \"(.*)\" and \"(.*)\" is given to login$")
	public void enterCredentials(String username, String password) {
		Setup.driver.findElement(By.id("email")).sendKeys(username);
		Setup.driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^Login successful$")
	public void login() {
		Setup.driver.findElement(By.id("loginbutton")).click();

	}

}
