package com.demoaut.newtours.certification.StepsDefinition;
import com.demoaut.newtours.certification.runners.pages.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepsDefinition {
	
	@Steps
	LoginSteps login;
	
	@Given("^The new tours page$")
	public void the_new_tours_page() {
		login.openUrl();
	}

	@When("^I fill the user and password field$")
	public void i_fill_the_user_and_password_field() {
		login.inputData();
	}

	@When("^Click the submit button$")
	public void click_the_submit_button() {
		login.sendData();
	}

	@Then("^I acceess to a new page$")
	public void i_acceess_to_a_new_page() {
		
		System.out.print("Logré iniciar sesión");
	}
}
