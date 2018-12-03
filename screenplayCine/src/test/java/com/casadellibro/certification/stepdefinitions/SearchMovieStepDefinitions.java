package com.casadellibro.certification.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.casadellibro.certification.tasks.GoTo;
import com.casadellibro.certification.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SearchMovieStepDefinitions {
	
	@Managed(driver = "Chrome")
	private WebDriver hisBrowser;
	
	private Actor freyns = Actor.named("freyns");
	
	@Before
	public void setUp() {
		hisBrowser.manage().window().maximize();
		freyns.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	}
	
	@Given("^that the user wants to choose a movie$")
	public void thatTheUserWantsToChooseAMovie() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		freyns.wasAbleTo(OpenTheBrowser.on());
	}

	@When("^the user manages to select the movie that he wants$")
	public void theUserManagesToSelectTheMovieThatHeWants() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		freyns.attemptsTo(GoTo.allBook());
	}

	@Then("^the should be able to see the movie that he selects$")
	public void theShouldBeAbleToSeeTheMovieThatHeSelects() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}


}
