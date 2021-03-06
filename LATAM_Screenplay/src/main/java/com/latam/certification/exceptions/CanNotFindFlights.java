package com.latam.certification.exceptions;

public class CanNotFindFlights extends AssertionError {
	
	private static final long serialVersionUID = 1L;
	private static final String ERROR_SEARCH_FLIGHT = "We do not find flights available";
		
	public static String getCanNotFindFlightsMessage() {
		return ERROR_SEARCH_FLIGHT;
	}
	//Constructor que llama al constructor de la clase padre AssertionError
	public CanNotFindFlights(String message, Throwable cause) {
		super(message, cause);
	}
}
