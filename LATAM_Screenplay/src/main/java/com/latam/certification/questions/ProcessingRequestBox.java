package com.latam.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.latam.certification.userinterfaces.BuyFlightComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProcessingRequestBox implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(BuyFlightComponent.PROCESSING_REQUEST).answeredBy(actor).isVisible();
	}

	public static ProcessingRequestBox flight(){
		return new ProcessingRequestBox();
	}
}
