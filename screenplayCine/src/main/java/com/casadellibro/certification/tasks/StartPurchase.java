package com.casadellibro.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class StartPurchase implements Task {
	
	private Target movie;
	
	public StartPurchase(Target movie) {
		this.movie= movie;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(movie));
		
	}
	public static StartPurchase on(Target movie) {
		
		return instrumented(StartPurchase.class,movie);
	}
}
