package com.casadellibro.certification.stepdefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.casadellibro.certification.tasks.AddMovie;
import com.casadellibro.certification.tasks.StartPurchase;
import com.casadellibro.certification.userinterfaces.BuyMovieComponent;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuyMovieStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser; //Si el actor fuera hombre seria hisBrowser
	
	//Creamos el actor,el método named hace lo mismo que el constructor
	private Actor freyns = Actor.named("Freyns");
	
	//En mi caso sería la pagina despues que se selecciona el libro.
	//private GoogleHomePage page;
	
	//Método para realizar el enlace entre el autor y el driver
	@Before
	public void setUp() {
		freyns.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	}
	
	@Given("^that freyns wants add the movie to the shopping cart$")
	public void that_freyns_wants_add_the_movie_to_the_shopping_cart()  {
		//1. Freynds fue capaz de abrir en el navegador la pagina
		//2. Freyns agrego al carrito de compras una pelicula
		
		freyns.wasAbleTo(AddMovie.toShoppingCart(BuyMovieComponent.ADD_BUY)
				//GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));//2. Ir a Google translate (click, etc ..
		);
	}

	@When("^he_start_the_purchase$")
	public void he_start_the_purchase()  {
		//3. Freyns fue capaz de iniciar la compra
		freyns.wasAbleTo(StartPurchase.on(BuyMovieComponent.START_BUY));
	}

	@Then("^he verifies that the purchase is in the order summary$")
	public void he_verifies_that_the_purchase_is_in_the_order_summary() {
	    
	}
}
