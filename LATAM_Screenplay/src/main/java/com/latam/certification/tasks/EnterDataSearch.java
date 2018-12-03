package com.latam.certification.tasks;

//Importación de librerías
//Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
//Models
import com.latam.certification.models.SearchDataFlight;
//UserInterfaces
import com.latam.certification.userinterfaces.SearchFlightComponent;

public class EnterDataSearch implements Task {
	
	private SearchDataFlight searchFlightData;

	
	public EnterDataSearch(SearchDataFlight searchFlightData) {
		this.searchFlightData= searchFlightData;
	}
	
	@Step("{0} enters the flight search criteria")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
						Enter.theValue(this.searchFlightData.getOrigin()).into(SearchFlightComponent.ORIGIN_FLIGHT),
						Click.on(SearchFlightComponent.FIRST_OPTION_ORIGIN),
						Enter.theValue(this.searchFlightData.getDestination()).into(SearchFlightComponent.DESTINATION_FLIGHT),
						Click.on(SearchFlightComponent.FIRST_OPTION_DESTINATION),
						//Check le da click a un boton dependiendo del parametro recibido desde feature
						Check.whether(searchFlightData.getFlightTypes().equals("Solo ida")).
			               andIfSo(Click.on(SearchFlightComponent.FLIGHT_TYPE_ONE_WAY)),
						Check.whether(searchFlightData.getFlightTypes().equals("Ida y Vuelta")).
				               andIfSo(Click.on(SearchFlightComponent.FLIGHT_TYPE_ROUND_TRIP)),
						Click.on(SearchFlightComponent.DEPARTURE_DATE),
						Click.on(SearchFlightComponent.DEPARTURE_DATE_DAY)
					    );

		actor.attemptsTo(Click.on(SearchFlightComponent.PASSENGER_COUNT));

		if(searchFlightData.getAdultPassengers()>1) {
			for(int i=1;i<searchFlightData.getAdultPassengers();i++) {
				actor.attemptsTo(Click.on(SearchFlightComponent.MORE_ADULTS));
			}
		}
		if(searchFlightData.getChildrenPassengers()>0 || searchFlightData.getBabyPassengers()>0) {
			actor.attemptsTo(Click.on(SearchFlightComponent.CHILDREN_BABIES));
		
			if(searchFlightData.getChildrenPassengers()>0) {
				for(int i=1;i<=searchFlightData.getChildrenPassengers();i++) {
					actor.attemptsTo(Click.on(SearchFlightComponent.MORE_CHILDREN));
				}
			}
			if(searchFlightData.getBabyPassengers()>0) {
				for(int i=1;i<=searchFlightData.getBabyPassengers();i++) {
					actor.attemptsTo(Click.on(SearchFlightComponent.MORE_BABIES));
				}
			}
		}
		actor.attemptsTo(Click.on(SearchFlightComponent.SUBMIT_SEARCH_FLIGH));
	}
	
	public static EnterDataSearch flight(SearchDataFlight searchFlightData) {
		return Instrumented.instanceOf(EnterDataSearch.class)
				.withProperties(searchFlightData);
	}
}
