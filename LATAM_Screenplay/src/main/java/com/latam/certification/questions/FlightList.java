package com.latam.certification.questions;

//Importación de librerías
//Serenity
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
//Components
import com.latam.certification.userinterfaces.SearchFlightComponent;

public class FlightList implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(SearchFlightComponent.FLIGHT_LIST).answeredBy(actor).isVisible();
	}
	
	public static FlightList container(){
		return new FlightList();
	}
}
