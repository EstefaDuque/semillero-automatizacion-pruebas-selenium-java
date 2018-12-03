package com.latam.certification.stepdefinitions;

//Importación de librerías
//Selenium
import org.openqa.selenium.WebDriver;
//java.util
import java.util.concurrent.TimeUnit;
import java.util.List;
//Cucumber

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//Serenity_Screenplay
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//Tasks
import com.latam.certification.tasks.EnterDataAdultPassenger;
import com.latam.certification.tasks.EnterDataBabyPassenger;
import com.latam.certification.tasks.EnterDataChildPassenger;
import com.latam.certification.tasks.EnterDataContactInformation;
import com.latam.certification.tasks.ChooseFlight;
//Exceptions
import static com.latam.certification.exceptions.CanNotFindFlightDetails.getCanNotFindFlightsDetailsMessage;
import com.latam.certification.exceptions.CanNotFindFlightDetails;
//Models
import com.latam.certification.models.AdultPassenger;
import com.latam.certification.models.BabyPassenger;
import com.latam.certification.models.ChildPassenger;
import com.latam.certification.models.ContactInformation;
//Questions
import com.latam.certification.questions.FlightDetails;
//Components
import com.latam.certification.userinterfaces.SelectFlightComponent;
//Managed
import net.thucydides.core.annotations.Managed;

public class SelectFlightStepDefinitions {
	
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
	
	@Given("^she wanted to select a flight randomly$")
	public void she_wanted_to_select_a_flight_randomly()  {
		givenThat(alice).wasAbleTo(ChooseFlight.of(SelectFlightComponent.FLIGHT_LIST));//ChooseFlight Elige un vuelo aleatoriamente que aparezcan el lista de vuelos.
	}

	@When("^she enters the data of the adult passengers$")
	public void sheEntersTheDataOfTheAdultPassengers(List<AdultPassenger> adultData) {
		when(alice).attemptsTo(EnterDataAdultPassenger.of(adultData.get(0)));//EnterDataAdultPassenger Ingresa la información de los pasajeros adultos.
	}

	@When("^she enters the data of the children passengers$")
	public void sheEntersTheDataOfTheChildrenPassengers(List<ChildPassenger> childData) {
		when(alice).attemptsTo(EnterDataChildPassenger.of(childData.get(0)));//EnterDataChildPassenger Ingresa la información de los pasajeros niños.
	}

	@When("^she enters the data of the babies passengers$")
	public void sheEntersTheDataOfTheBabiesPassengers(List<BabyPassenger> babyData)  {
		when(alice).attemptsTo(EnterDataBabyPassenger.of(babyData.get(0)));//EnterDataBabyPassenger Ingresa la información de los pasajeros bebés.
   	}

	@When("^she enters contact information$")
	public void sheEntersContactInformation(List<ContactInformation> contactInformation)  {
		when(alice).attemptsTo(EnterDataContactInformation.of(contactInformation.get(0))); //Ingresa la información de contacto en general.
 	}

	@Then("^she will verify your reservation$")
	public void sheWillVerifyYourReservation()  {
		then(alice).should(seeThat(FlightDetails.container()).orComplainWith(CanNotFindFlightDetails.class,//FlightDetails Busca el container que contiene la información detallada del vuelo.
				getCanNotFindFlightsDetailsMessage()));
	}


}
