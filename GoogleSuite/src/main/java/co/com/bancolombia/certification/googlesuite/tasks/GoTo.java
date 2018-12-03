package co.com.bancolombia.certification.googlesuite.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;

//En esta tarea se le da click al boton de las aplicaciones de google
public class GoTo implements Task{
	
	private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp= googleApp;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
				Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		return instrumented(GoTo.class,googleApp);
	}
}
