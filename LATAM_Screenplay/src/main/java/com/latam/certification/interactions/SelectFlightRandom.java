package com.latam.certification.interactions;

//Importación de librerías
//Serenity
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFlightRandom implements Interaction{

	private Target flightList;
	private int sizeList, flightNumber;
		
	public SelectFlightRandom(Target flightList) {
		this.flightList=flightList;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		sizeList=flightList.resolveAllFor(actor).size();
		flightNumber = (int) (Math.random() * sizeList) + 1;
		
		final Target CHOOSE_FLIGHT = Target.the("Choose flight").located(By.xpath("//div//div//div//section[@class='container flight-list']//ul//li["+flightNumber+"]"));
		actor.attemptsTo(Click.on(CHOOSE_FLIGHT));
	
	}
	public static SelectFlightRandom of(Target flightList)
	{
		return Instrumented.instanceOf(SelectFlightRandom.class)
				.withProperties(flightList);
	}

}
