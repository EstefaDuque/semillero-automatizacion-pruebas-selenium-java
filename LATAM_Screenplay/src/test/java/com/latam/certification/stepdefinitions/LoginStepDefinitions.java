package com.latam.certification.stepdefinitions;

//Importaci�n de librer�as
//Selenium
import org.openqa.selenium.WebDriver;
//java.util
import java.util.List; 
import java.util.concurrent.TimeUnit;
//Cucumber
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
//Serenity_Screenplay
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
//Tasks
import com.latam.certification.tasks.EnterDataLogin;
import com.latam.certification.tasks.GoLogin;
import com.latam.certification.tasks.OpenTheApplication;
//Exceptions
import com.latam.certification.exceptions.NotSuccesfulLogin;
import static com.latam.certification.exceptions.NotSuccesfulLogin.getNotSuccesfulLoginMessage;
//Models
import com.latam.certification.models.LoginModel;
//Questions
import com.latam.certification.questions.UserNameHeader;
//UserInterfaces
import com.latam.certification.userinterfaces.LatamHomePage;
//Managed
import net.thucydides.core.annotations.Managed;


public class LoginStepDefinitions {
	
	/*La @Managedanotaci�n le dice a Serenity que esta es una prueba web. Serenity se encarga de crear una instancia 
	de la instancia de WebDriver, abrir el navegador y apagarlo al final de la prueba.*/
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	//Creamos el actor,el m�todo named hace lo mismo que un constructor.
	private Actor alice = Actor.named("Alice");
	
	private LatamHomePage latamHomePage; 
	
	//M�todo para realizar el enlace entre el autor y el driver.
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
	
	@Given("^that alice wanted to login$")
	public void thatAliceWantedToLogin()  {
		//El metodo wasAbleTo recibe como parametros tareas(fue capaz de).
		givenThat(alice).wasAbleTo(
				OpenTheApplication.on(latamHomePage),//OpenTheApplication Abre la pagina que le enviemos
				GoLogin.theApp()					//GoLogin selecciona el boton iniciar sesi�n
				);
	}
	
	@When("^she enters to her account with her information$")
	public void sheEntersToHerAccountWithHerInformation(List<LoginModel> loginData)  {
		//El m�todo attemptsTo recibe como parametros tareas (intentar)
		when(alice).attemptsTo(EnterDataLogin.of(loginData.get(0)));//EnterDataLogin ingresa los datos para iniciar sesi�n
	}
	
	@Then("^she will verify that she entered correctly$")
	public void sheWillVerifyThatSheEnteredCorrectly(){
		
		//Should recibe dos parametros(resultadoObtenido(question),resultadoEsperado(exception)), .
		//Si la question no recibe el resultado esperado entonces se lanza el mensaje de la exception.
		
		then(alice).should(seeThat(
				UserNameHeader.page()).orComplainWith(NotSuccesfulLogin.class, //UserNameHeader busca la cabecera de la pagina.
				getNotSuccesfulLoginMessage()));
	}

	

}