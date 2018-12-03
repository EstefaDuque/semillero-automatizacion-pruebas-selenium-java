package com.procinal.certification.cinema.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.findby.By;

import com.procinal.certification.cinema.tasks.click;
import com.procinal.certification.cinema.tasks.verifyTheResult;
import com.procinal.certification.cinema.userinterfaces.ProcinalComponents;
import com.procinal.certification.cinema.tasks.openTheBrowser;
import com.procinal.certification.cinema.utils.procinalLandingPage;
public class ProcinalStepdefinitions {
	
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private procinalLandingPage page;
	
	private Actor pacho = new Actor("pacho");
	
	@Before
	public void setUp() {
		pacho.can(BrowseTheWeb.with(hisBrowser));
	}
	@Given("^Actor go to procinal$")
	public void actorGoToProcinal() throws Exception {
		pacho.wasAbleTo(openTheBrowser.on(page));
	}

	@When("^the actor enter city$")
	public void theActorEnterCity() throws Exception {
		pacho.wasAbleTo(click.on(page));
	}

	@Then("^review your search$")
	public void reviewYourSearch() throws Exception {
		//pacho.wasAbleTo(verifyTheResult.inThe(ProcinalComponents.LABEL_MOVIE_TITLE_SHOPPING_PAGE,movieName));
			}

	

}
