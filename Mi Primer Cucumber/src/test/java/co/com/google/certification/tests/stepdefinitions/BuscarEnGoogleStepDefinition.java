package co.com.google.certification.tests.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import  org.junit.Assert;

import co.com.google.certification.pages.BuscarEnGooglePOM;

public class BuscarEnGoogleStepDefinition {
	
	BuscarEnGooglePOM chamol= new BuscarEnGooglePOM("webdriver.chrome.driver",
			"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	@Given("^que puedo abrir el navegador$")
	public void que_puedo_abrir_el_navegador() {
		
		chamol.openBrowser("chrome");
	}
	
	@When("Voy a google")
	public void voy_a_google() {
		//Llamar método para abrir página web
		chamol.openUrl("https://www.google.com.co");
	}
	
	@When("Realizo una busqueda")
	public void realizo_una_busqueda()  {
		
		chamol.searchElement("q","name");
	    chamol.writeText("Playas de colombia");
		chamol.clic(chamol.searchElement("btnK","name"));

	}
	
	@Then("Valido que el resultado sea el esperado")
	public void valido_que_el_resultado_sea_el_esperado()   {
		
		//Validamos el titulo de la página.
		Assert.assertEquals(chamol.getTitlePage(),"Playas de colombia - Buscar con Google");
		
	}
	
	@Then("^Cierro el navegador$")
	public void cierro_el_navegador() {
		chamol.closeTest();
	}
	


}
