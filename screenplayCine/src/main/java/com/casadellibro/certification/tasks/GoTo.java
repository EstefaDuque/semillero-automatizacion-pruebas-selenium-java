package com.casadellibro.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.casadellibro.certification.userinterfaces.SearchMovieComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;;

public class GoTo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SearchMovieComponent.CLOSE_DIALOG));
		actor.attemptsTo(Click.on(SearchMovieComponent.ALL_PRODUCTS),
						 Click.on(SearchMovieComponent.MOVIE));
		actor.attemptsTo(Click.on(SearchMovieComponent.ALL_MOVIE));
		
	}

	public static GoTo allBook() {
		return instrumented(GoTo.class);
	}
	
	
}
