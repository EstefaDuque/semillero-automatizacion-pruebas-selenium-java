package com.latam.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.latam.certification.exceptions.CanNotProcessingFlightRequest;
import static com.latam.certification.exceptions.CanNotProcessingFlightRequest.getCanNotProcessingFlightRequestMessage;
import com.latam.certification.models.BuyData;
import  com.latam.certification.questions.ProcessingRequestBox;
import com.latam.certification.tasks.EnterFlightBuyData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;

public class BuyFlightStepDefinitions {

	/*La @Managedanotación le dice a Serenity que esta es una prueba web. Serenity se encarga de crear una instancia 
	de la instancia de WebDriver, abrir el navegador y apagarlo al final de la prueba.*/
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	//Creamos el actor,el método named hace lo mismo que un constructor.
	private Actor alice = Actor.named("Alice");
	
	//Método para realizar el enlace entre el autor y el driver.
	@Before
	public void setUp() {
		
		//BrowseTheWeb es la habilidad que tiene el actor para abrir el naveador.
		alice.can(BrowseTheWeb.with(herBrowser));
		
		/*implicitlyWait se utiliza para establecer el tiempo de espera predeterminado en 
		todo el programa, evita errores de tipo org.openqa.selenium.NoSuchElementException:
		no such element.*/
		herBrowser.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		
		//maximize se utiliza para maximizar la ventana del navegador
		herBrowser.manage().window().maximize();
	}
	
	@When("^she selects the payment method$")
	public void sheSelectsThePaymentMethod(List<BuyData> buyData)  {
		when(alice).attemptsTo(EnterFlightBuyData.of(buyData.get(0)));//EnterFlightBuyData ingresa los datos de la compra.
	}
	
	@Then("^she will verify your reservation code$")
	public void sheWillVerifyYourReservationCode()  {
		then(alice).should(seeThat(ProcessingRequestBox.flight()).orComplainWith(CanNotProcessingFlightRequest.class,//ProcessingRequestBox busca el container procesa la respuesta de la compra.
				getCanNotProcessingFlightRequestMessage()));
	}
}
