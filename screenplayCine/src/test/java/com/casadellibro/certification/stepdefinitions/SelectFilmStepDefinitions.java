package com.casadellibro.certification.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.casadellibro.certification.tasks.SelectMovie;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SelectFilmStepDefinitions {
	
	@Managed(driver ="chrome")   //para realizar la instasacion se hace inyeccion de dependencias , se hace uso de la notacion managed que al pasarle el atributo driver espeficando chrome ,hará uso del que tenemos en la raiz
	private WebDriver hisBrowser; // variable de clase 
	private Actor freyns = Actor.named("Freyns"); // no se usa new sino que se hace uso del patron object builder, se hace uso de un metodo estatico que hace lo mismo por debajo
	
	
	@Before //creamos un metodo que se ejecute antes que todos los demas , hacemos uso de la notacion before (importar la de cucumber)
	public void setUp() {
		freyns.can(BrowseTheWeb.with(hisBrowser)); //se le da una habilidad al actor o sea hacer uso del navegador
			
	}
	
	@Given("^that the user wants to select a movie$") //acciones a llevar a cabo para llevar antes de llegar al when
	public void thatTheUserWantsToSelectAMovie() throws Exception {
		//1.Abrir la pagina en https://www.casadellibro.com/peliculas
		//2. hacer clic  en la pelicula 
		//3. hacer clic en ver mas detalles
		//OpenTheBrowserOn openOnPage = new OpenTheBrowserOn();// se crea una instancia porque los metodos reciben objetos y no clases
		//freyns.wasAbleTo(OpenTheBrowserOn.on()); // para utilizar el OpenTheBrowser necesitamos un metodo estatico en la clase OpentheBrowser on, el objetivo de este metodo estatico es crear la instancia de la clase
		
	}

	@When("^he see the deatils$") // donde se raliza lo que queremos probar (lo que queremos ver si se hace bien o mal) 
	public void heSeeTheDeatils() throws Exception {
		freyns.wasAbleTo(SelectMovie.the());
	}

	@Then("^he should see the buy option$")
	public void heShouldSeeTheBuyOption() throws Exception {
	 
	}

}
