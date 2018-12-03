package com.casadellibro.certification.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.casadellibro.certification.userinterfaces.GoogleHomePage;
import com.casadellibro.certification.userinterfaces.MovieComponent;
import com.casadellibro.certification.tasks.OpenTheBrowser;
import com.casadellibro.certification.tasks.StartPurchase;
import com.casadellibro.certification.tasks.AddMovie;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.hasItem;

public class BuyMovieStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser; //Si el actor fuera hombre seria hisBrowser
	
	//Creamos el actor,el método named hace lo mismo que el constructor
	private Actor freyns = Actor.named("Freyns");
	
	//En mi caso sería la pagina despues que se selecciona el libro.
	private GoogleHomePage page;
	
	//Método para realizar el enlace entre el autor y el driver
	@Before
	public void setUp() {
		freyns.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	}
	
	@Given("^that freyns wants add the movie to the shopping cart #precondition o proposito$")
	public void that_freyns_wants_add_the_movie_to_the_shopping_cart_precondition_o_proposito()  {
		
	    //1. Freynds fue capaz de abrir en el navegador la pagina
		//2. Freyns agrego al carrito de compras una pelicula
		
		freyns.wasAbleTo(OpenTheBrowser.on(page),
						AddMovie.toShoppingCart(MovieComponent.ADD_BUY)//GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));//2. Ir a Google translate (click, etc ..
	);
	}

	@When("^he  start the purchase #Las acciones de la prueba$")
	public void he_start_the_purchase_Las_acciones_de_la_prueba() {
		//3. Freyns fue capaz de iniciar la compra
		freyns.wasAbleTo(StartPurchase.on(MovieComponent.START_BUY));
	}

	@Then("^he verifies that the purchase is in the order summary #condiciones de verificacion$")
	public void he_verifies_that_the_purchase_is_in_the_order_summary_condiciones_de_verificacion() throws Exception {
		
		//Should toma como parametro: un objeto pregunta,
		/*freyns.should();
		seeThat();
		assertThat(5, is(equalTo(5)));*/
	}


}
