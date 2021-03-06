 package co.com.bancolombia.certification.googlesuite.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
//Se usa static para no tener que nombrar la clase solo el metodo estatico instrumented
import static net.serenitybdd.screenplay.Tasks.instrumented;

//En esta clase abre la pagina de google
public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page=page;
	}
	@Override
	
	@Step("{0} opens the browser on Google Home Page")
	
	//Dentro de attempts van las acciones (open,click,enter ..).
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
	}
	
	//Constructor se le pone el nombre que queramos para que sea mas leible
	//Este m�todo crea una nueva instancia
	public static OpenTheBrowser on(PageObject page) {
		//return new OpentTheBrowser();
		return instrumented(OpenTheBrowser.class,page);
	}

}
