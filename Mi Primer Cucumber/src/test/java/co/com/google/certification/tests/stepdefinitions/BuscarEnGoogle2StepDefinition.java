package co.com.google.certification.tests.stepdefinitions;


import org.junit.Assert;

import co.com.google.certification.pages.BuscarEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarEnGoogle2StepDefinition {
	
	BuscarEnGooglePOM chamol= new BuscarEnGooglePOM("webdriver.chrome.driver",
			"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	@Given("^Inicio el navegador Chrome$")
	public void inicio_el_navegador_Chrome() {
		chamol.openBrowser("chrome");
	}

	@When("^Abro la pagina de inicio de Google$")
	public void abro_la_pagina_de_inicio_de_Google()  {
		chamol.openUrl("https://www.google.com.co");
	}

	@When("^Busco \"([^\"]*)\" en Google$")
	public void busco_en_Google(String textoBusqueda) {
		   chamol.searchElement("q","name");
		   chamol.writeText(textoBusqueda);
		   chamol.clic(chamol.searchElement("btnK","name"));
	}

	@Then("^Valido que realizo la busqueda$")
	public void valido_que_realizo_la_busqueda()  {
		//Validamos el texto en el campo de busqueda.
		chamol.searchElement("q","name");
		
		Assert.assertEquals(chamol.getTextElement(),"Playas mas bonitas de colombia");
	}
	

	@Then("^Cierro el navegador(\\d+)$")
	//mando un parametro porque en el then del feature le dije buscar navegador2
	public void cierro_el_navegador(int arg1){
		chamol.closeTest();

	}
	
	
}
