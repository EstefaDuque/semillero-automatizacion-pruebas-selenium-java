package com.casadellibro.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AddMovie implements Task{
	
	private Target movie;
	
	public AddMovie(Target movie) {
		this.movie= movie;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(movie));
		
	}
	
	public static AddMovie toShoppingCart(Target movie) {
		
		return instrumented(AddMovie.class,movie);
	}

}
