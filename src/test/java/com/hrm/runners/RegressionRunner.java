package com.hrm.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="src/test/resources/features/", 
		
		glue="com.hrm.steps", 
		
		dryRun = false,
		
		monochrome=true, 
		
		tags = "@menu",

		plugin = {
				// prints the Gherkin scenario(s) steps to the console
				// "pretty",
				// creates and saves the basic html report in the target folder
				"html:target/regression-report.html", "json:target/cucumber.json", "rerun:target/failed.txt"

		}
		
		)

public class RegressionRunner {

}
