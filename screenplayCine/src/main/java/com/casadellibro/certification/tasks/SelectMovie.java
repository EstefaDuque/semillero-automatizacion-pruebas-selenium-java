package com.casadellibro.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.casadellibro.certification.userinterfaces.SelectMovieComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;;

public class SelectMovie implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(SelectMovieComponent.SELECT_MOVIE));
		actor.attemptsTo(Click.on(SelectMovieComponent.SELECT_MORE_DETAILS));
		/*actor.attemptsTo(Click.on(MovieComponent.ADD_BUY));
		actor.attemptsTo(Click.on(MovieComponent.START_BUY));*/
	}

	public static SelectMovie the() {
		return instrumented(SelectMovie.class);
	}
	
	
}
