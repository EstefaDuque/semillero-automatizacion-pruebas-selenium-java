package com.latam.certification.tasks;

//Importaci�n de librer�as
//Serenity
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
//Exception
import com.latam.certification.exceptions.WhitOutConnectionToTheLatam;
import static com.latam.certification.exceptions.WhitOutConnectionToTheLatam.getNoLoadsCorrectlyMessage;
//Step junit
import net.thucydides.core.annotations.Step;
//questions
import com.latam.certification.questions.LatamLoads;

public class OpenTheApplication implements Task {

	private PageObject page;
	
	public OpenTheApplication(PageObject page) {
		this.page= page;
	}
	
	@Step("{0} opens the browser on '#page'")

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(page)); //Abre la p�gina que se le envie.
		//Verifica que efectivamente se abre la pagina, de lo contrario arroja un exception
		actor.should(seeThat(
				LatamLoads.Correctly()).orComplainWith(WhitOutConnectionToTheLatam.class,
				getNoLoadsCorrectlyMessage()));
	}
	
	//Este m�todo retorna una instancia de la clase, instrumented es los mismo que return new
	public static OpenTheApplication on(PageObject page) {
		return instrumented(OpenTheApplication.class,page);
	}
}