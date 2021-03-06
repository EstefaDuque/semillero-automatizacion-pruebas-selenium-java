package com.latam.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchFlightComponent {

	/*La clase Target es una forma conveniente de asociar un texto legible por el usuario ("what_needs_to_be_done") con una
	estrategia de ubicaci�n WebDriver.*/
	public static final Target ORIGIN_FLIGHT = Target.the("Origin of the flight").located(By.id("compra-select-origin"));
	public static final Target DESTINATION_FLIGHT = Target.the("Destination of the flight").located(By.id("compra-select-destination"));
	public static final Target FLIGHT_TYPE_ONE_WAY = Target.the("Type of flight one way").located(By.xpath("//div[contains(@class,'compra__flight-date-region')]//input[contains(@value,'showDepartureOnly')]"));
	public static final Target FLIGHT_TYPE_ROUND_TRIP = Target.the("Type of flight round trip").located(By.xpath("//div[contains(@class,'compra__flight-date-region')]//input[contains(@value,'showDepartureAndReturn')]"));
	public static final Target DEPARTURE_DATE = Target.the("Departure date of the flight").located(By.xpath("//div[@class='compra__flight-date-region']//div[@class='flight-date__departure-day-region']//div[@class='box-input']"));
	public static final Target PASSENGER_COUNT = Target.the("Number of passengers").located(By.id("compra-passenger-count-id"));
	public static final Target SUBMIT_SEARCH_FLIGH = Target.the("Search flight button").located(By.xpath("//button[contains(text(),'Busca tu vuelo')]"));
	public static final Target FIRST_OPTION_ORIGIN = Target.the("First option of origin").located(By.id("ui-id-1"));
	public static final Target FIRST_OPTION_DESTINATION = Target.the("First option of origin").located(By.id("ui-id-2"));
	public static final Target MORE_ADULTS = Target.the("More adult passengers").located(By.xpath("//div[@class='box-component passenger-count col-xs-12 col-md-12 active']//div[@class='row adults-content passengers-content show']//span[@class='input-group-btn more']"));
	public static final Target CHILDREN_BABIES = Target.the("link more children or babies").located(By.xpath("//div[@class='box-component passenger-count col-xs-12 col-md-12 active']//div[@class='box-panel shadow-box spinners col-xs-12 col-sm-12']//div//a[@class='link-children-or-babies'][contains(text(),'A�adir ni�os o beb�s')]"));
	public static final Target MORE_CHILDREN = Target.the("More children passengers").located(By.xpath("//div[@class='row children-content passengers-content']//span[@class='icon-int-more icon-xsmall']"));
	public static final Target MORE_BABIES = Target.the("More babies passengers").located(By.xpath("//div[@class='row infants-content passengers-content']//span[@class='input-group-btn more']"));
	public static final Target FLIGHT_LIST = Target.the("Container flight list").located(By.xpath("//section[@class='container flight-list']"));
	public static final Target DEPARTURE_DATE_DAY = Target.the("Departure day of the flight").located(By.xpath("//td[contains(@class,'ui-datepicker-week-end')]//a[contains(@class,'ui-state-default')][contains(text(),'15')]"));

	
}
