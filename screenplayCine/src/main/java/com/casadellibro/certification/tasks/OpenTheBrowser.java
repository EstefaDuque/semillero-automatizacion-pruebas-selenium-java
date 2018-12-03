package com.casadellibro.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.casadellibro.certification.userinterfaces.PageCineCasaDelLibro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

	@Override
	@Step ("{0} Open el browser on casadellibro Home page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new PageCineCasaDelLibro()));
		// Open, Click, Enter, Hit, ...
	}

	public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
		// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
		// return new OpenBrowser(page);
	}

}
