package com.latam.certification.stepdefinitions;

//Importación de librerías
//Selenium
import org.openqa.selenium.WebDriver;
//java.util
import java.util.List;
import java.util.concurrent.TimeUnit;
//Cucumber
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//Serenity_Screenplay
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//Tasks
import com.latam.certification.tasks.EnterDataSearch;
//Exceptions
import static com.latam.certification.exceptions.CanNotFindFlights.getCanNotFindFlightsMessage;
import com.latam.certification.exceptions.CanNotFindFlights;
//Models
import com.latam.certification.models.SearchDataFlight;
//Questions
import com.latam.certification.questions.FlightList;
//Managed
import net.thucydides.core.annotations.Managed;


public class SearchFlightStepDefinitions {
	
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
	
	
	@When("^alice enters the search criteria$")
	public void aliceEntersTheSearchCriteria(List<SearchDataFlight> searchFlightData)  {
		
		when(alice).attemptsTo(EnterDataSearch.flight(searchFlightData.get(0)));//EnterDataSearch Ingresa los criterios de busqueda.
				    
	}

	@Then("^she will verify that she found at least one flight$")
	public void sheWillVerifyThatSheFoundAtLeastOneFlight()  {
		then(alice).should(seeThat(FlightList.container()).orComplainWith(CanNotFindFlights.class,// //FlightList el contenedor de la lista de vuelos.
						getCanNotFindFlightsMessage()));
	}
}
