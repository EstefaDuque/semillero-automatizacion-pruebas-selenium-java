package com.latam.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.latam.certification.userinterfaces.SelectFlightComponent;

public class FlightDetails implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(SelectFlightComponent.FLIGHT_DETAILS).answeredBy(actor).isVisible();
	}
	public static FlightDetails container(){
		return new FlightDetails();
	}
}
