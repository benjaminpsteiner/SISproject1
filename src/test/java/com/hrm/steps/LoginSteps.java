package com.hrm.steps;

import org.junit.Assert;

import com.sis.utils.CommonMethods;
import com.sis.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
	
	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
	   sendText(loginPage.Username,ConfigsReader.getProperty("username"));
	  
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		  sendText(loginPage.password,ConfigsReader.getProperty("password"));
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
	   click(loginPage.login);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
	    String expected = "Students";
	    String actual = homePage.students.getText();
	    
	   Assert.assertEquals(expected, actual);
	}

}
