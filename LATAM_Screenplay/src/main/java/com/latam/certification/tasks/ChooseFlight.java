package com.latam.certification.tasks;

//Importación de Librerías
//Serenity
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
//Interactions
import com.latam.certification.interactions.SelectFlightRandom;
//UserInterfaces
import static com.latam.certification.userinterfaces.SelectFlightComponent.CONTINUE_INFORMATION_PASSENGER;

public class ChooseFlight implements Task{
	
	private Target flightList;
	
	public ChooseFlight(Target flightList) {
		this.flightList=flightList;
	}
	
	@Step("{0} chooses a flight randomly")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				SelectFlightRandom.of(this.flightList),//Interacción se le envie un objeto de tipo target. 
				Click.on(CONTINUE_INFORMATION_PASSENGER));
	}
	
	public static ChooseFlight of(Target flightList) {
		return Instrumented.instanceOf(ChooseFlight.class)
				.withProperties(flightList);
	}
}
