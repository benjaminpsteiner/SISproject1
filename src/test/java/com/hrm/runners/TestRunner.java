package com.hrm.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features",

		glue = "com.hrm.steps",

		dryRun = false,

		monochrome = true,

		tags = "@smoke",

		plugin = {
				// prints the Gherkin scenario(s) steps to the console
				"pretty",
				// creates and saves the basic html report in the target folder
				"html:target/cucumber-default-report.html",
				// stores all executed steps in a json file
				"json:target/cucumber.json" }

)

public class TestRunner {

}
