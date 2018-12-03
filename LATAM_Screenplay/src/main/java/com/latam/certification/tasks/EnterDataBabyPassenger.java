package com.latam.certification.tasks;

import com.latam.certification.models.BabyPassenger;

import com.latam.certification.userinterfaces.SelectFlightComponent;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

public class EnterDataBabyPassenger implements Task {
	
	private BabyPassenger babyData;

	public EnterDataBabyPassenger(BabyPassenger babyData) {
		this.babyData= babyData;
	}
	@Step("{0} enters the data of the babies passengers")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue(this.babyData.getBabyName()).into(SelectFlightComponent.BABY_NAME),
				Enter.theValue(this.babyData.getBabyLastname()).into(SelectFlightComponent.BABY_LASTNAME),
				Check.whether(this.babyData.getBabyIdType().equals("Pasaporte")).
		                andIfSo(Click.on(SelectFlightComponent.BABY_ID_TYPE_PASSPORT)).otherwise(),
		        Check.whether(this.babyData.getBabyIdType().equals("Cedula")).
		                andIfSo(Click.on(SelectFlightComponent.BABY_ID_TYPE_PASSPORT)).otherwise(),
				Enter.theValue(this.babyData.getBabyIdNumber()).into(SelectFlightComponent.BABY_ID_NUMBER),
				SelectFromOptions.byVisibleText(this.babyData.getBabyOrigineCountry()).from(SelectFlightComponent.BABY_ORIGIN_COUNTRY),
				Enter.theValue(this.babyData.getBabyBirthDateDay()).into(SelectFlightComponent.BABY_BIRTH_DATE_DAY),
				SelectFromOptions.byVisibleText(this.babyData.getBabyBirthDateMonth()).from(SelectFlightComponent.BABY_BIRTH_DATE_MONTH),
				Enter.theValue(this.babyData.getBabyBirthDateYear()).into(SelectFlightComponent.BABY_BIRTH_DATE_YEAR)
				);
	}
	public static EnterDataBabyPassenger of(BabyPassenger babyData) {
		return Instrumented.instanceOf(EnterDataBabyPassenger.class)
			.withProperties(babyData);
				
	}
}
