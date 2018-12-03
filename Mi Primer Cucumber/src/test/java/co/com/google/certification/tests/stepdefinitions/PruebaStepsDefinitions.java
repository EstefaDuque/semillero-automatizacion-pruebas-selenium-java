package co.com.google.certification.tests.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PruebaStepsDefinitions {
	
	@Given("^Precondiciones$")
	public void precondiciones()  {
	    System.out.println("Precondiciones");
	}
	
	@When("^Realizo acciones$")
	public void realizo_acciones()  {
		System.out.println("Acciones");
	}

	@Then("^Valido el resultado$")
	public void valido_el_resultado() {
		System.out.println("Resultado");
	}
	

}
