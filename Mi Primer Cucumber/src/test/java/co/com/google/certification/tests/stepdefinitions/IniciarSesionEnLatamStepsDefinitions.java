package co.com.google.certification.tests.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import co.com.google.certification.pages.BuscarEnGooglePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class IniciarSesionEnLatamStepsDefinitions {
	
	BuscarEnGooglePOM chamol= new BuscarEnGooglePOM("webdriver.chrome.driver",
			"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	@Given("^Que inicio el navegador Chrome$")
	public void que_inicio_el_navegador_Chrome() {
		chamol.openBrowser("chrome");
	}
	
	@When("^Abro la pagina de inicio de Latam$")
	public void abro_la_pagina_de_inicio_de_Latam() {
		chamol.openUrl("https://www.latam.com/es_co/?gclid=EAIaIQobChMIm8fU0cvV3gIVzbbACh3fjgwzEAAYASAAEgLyMvD_BwE&gclsrc=aw.ds");
	}
	
	@When("^Clickeo en el boton Iniciar sesion$")
	public void clickeo_en_el_boton_Iniciar_sesion()  {
		chamol.openUrl("https://www.latam.com/cgi-bin/site_login.cgi?page=https://www.latam.com/es_co/");
	}

		
	@When("^Digito el correo como \"([^\"]*)\" y la contrasena como \"([^\"]*)\"$")
	public void digito_el_correo_como_y_la_contrasena_como(String correo, String contrasena)  {
		
		chamol.searchElement("login","id");
		chamol.writeText(correo);
		chamol.searchElement("password","id");
		chamol.writeText(contrasena);
		
		//Imprimo por consola los datos de logueo.
		System.out.println("Datos del Login");
		System.out.println("El correo es: "+correo);
		System.out.println("La contrasena es: "+contrasena);
	}
	
	@When("^Clickeo en el boton Ingresar$")
	public void clickeo_en_el_boton_Ingresar() {
		
		chamol.clic(chamol.searchElement("btnEnter", "id"));

	}
		
	@Then("^Verifico que haya iniciado sesion con \"([^\"]*)\"$")
	
	/*En este m�todo buscamos un elemento de la p�gina que solo aparece cuando se ha iniciado 
	sesi�n, si no aparece es porque no ha iniciado sesi�n.*/
	public void verifico_que_haya_iniciado_sesion_con(String resultado) {
		
		WebElement elemento;
		elemento=chamol.searchElement("//button[@class='Login-launcher nav-item isVisible']", "xpath");
		//Valida que el elemento no es nulo y si es nulo lanza el assert.
		Assert.assertNotEquals(null, elemento);
	}

	@Then("^Cierro la pagina de Latam$")
	public void cierro_la_pagina_de_Latam()  {
	    chamol.closeTest();
	}
	
	
}
