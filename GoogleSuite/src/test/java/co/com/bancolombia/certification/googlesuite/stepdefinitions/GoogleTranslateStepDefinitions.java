package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser; //Si el actor fuera hombre seria hisBrowser.
	
	//Creamos el actor,el m�todo named hace lo mismo que un constructor.
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomepage;
	
	//M�todo para realizar el enlace entre el autor y el driver.
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
		
		/*implicitlyWait se utiliza para establecer el tiempo de espera predeterminado en 
		todo el programa, evita errores de tipo org.openqa.selenium.NoSuchElementException:
		no such element.*/
		herBrowser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	//Given Ponemos todo lo que hacemos para llegar a la condici�n.
	@Given("^that susan wants to translate a word$")
	public void that_susan_wants_to_translate_a_word() {
		
		//wasAbleto= Actor fue capaz ( en pasado)
	    //1. Abrir el navegador en el home de google : http//www.google.com.
		//Object builder= El objetivo del m�todo .on es crear la instancia de la clase.
		//Abre la pagina que se le indica
		susan.wasAbleTo(OpenTheBrowser.on(googleHomepage),
						//2. Ir a Google translate (click, etc ..
						GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}
	
	//When Ponemos las condiciones.
	@When("^she translates I complete action$")
	public void she_translates_I_complete_action()  {
		susan.wasAbleTo(Translate.the());
	}

	//Then Ponemos las consecuencias.
	@Then("^she should see the word queso in the screen$")
	public void she_should_see_the_word_queso_in_the_screen() {
	    // Consecuencias: Aparece la palabra traducida - verificarlo

	}
}