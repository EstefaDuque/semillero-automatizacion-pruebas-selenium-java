package com.casadellibro.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.casadellibro.certification.userinterfaces.CasaDelLibroMoviesComponents;;

public class GoTo implements Task{ //Cuando implementamos task nos volvemos hijos de performable

	@Override
	public <T extends Actor> void performAs(T actor) { 
		actor.attemptsTo(Click.on(CasaDelLibroMoviesComponents.SELECT_MOVIE));
		actor.attemptsTo(Click.on(CasaDelLibroMoviesComponents.SELECT_MORE_DETAILS));
		
		
	}

	public static GoTo theApp() {  //(el .theApp debe devolver un performable porque es lo que recibe el wasAbleTo
		return instrumented(GoTo.class);
	}
	

}
