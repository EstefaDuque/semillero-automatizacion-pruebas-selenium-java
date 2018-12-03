package com.latam.certification.tasks;

import com.latam.certification.models.AdultPassenger;
import com.latam.certification.userinterfaces.SelectFlightComponent;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

public class EnterDataAdultPassenger implements Task {

	private AdultPassenger adultData;

	public EnterDataAdultPassenger(AdultPassenger adultData) {
		this.adultData= adultData;
	}
	@Step("{0} enters the data of the babies passengers")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue(this.adultData.getAdultName()).into(SelectFlightComponent.ADULT_NAME),
				Enter.theValue(this.adultData.getAdultLastname()).into(SelectFlightComponent.ADULT_LASTNAME),
				Check.whether(this.adultData.getAdultIdType().equals("Pasaporte")).
		                andIfSo(Click.on(SelectFlightComponent.ADULT_ID_TYPE_PASSPORT)).otherwise(),
		        Check.whether(this.adultData.getAdultIdType().equals("Cedula")).
		                andIfSo(Click.on(SelectFlightComponent.ADULT_ID_TYPE_PASSPORT)).otherwise(),
				Enter.theValue(this.adultData.getAdultIdNumber()).into(SelectFlightComponent.ADULT_ID_NUMBER),
				SelectFromOptions.byVisibleText(this.adultData.getAdultOrigineCountry()).from(SelectFlightComponent.ADULT_ORIGIN_COUNTRY)//SelectFromOptions Se usa para elementos de tipo listas desplegables (select)
				);
	}
	public static EnterDataAdultPassenger of(AdultPassenger adultData) {
		return Instrumented.instanceOf(EnterDataAdultPassenger.class)
			.withProperties(adultData);
	}
}