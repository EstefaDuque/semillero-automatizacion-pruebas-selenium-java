package com.casadellibro.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.casadellibro.certification.userinterfaces.ComponentBuscaPelicula;;

public class GoTo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ComponentBuscaPelicula.CLOSE_DIALOG));
		actor.attemptsTo(Click.on(ComponentBuscaPelicula.ALL_PRODUCTS),
						 Click.on(ComponentBuscaPelicula.MOVIE));
		actor.attemptsTo(Click.on(ComponentBuscaPelicula.ALL_MOVIE));
	}

	public static GoTo allBook() {
		return instrumented(GoTo.class);
	}

}
