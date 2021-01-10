package com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\rahul\\eclipse-workspace\\test\\src\\main\\java\\com\\qa\\features\\Shipping.feature", 
		glue = { "com.qa.stepDefinations" }, 
		format = { "pretty","json:target/status.json","junit:target/status.xml" },
		plugin = ("json:target/status.json"),
		monochrome = true

)

public class Runner {

}
