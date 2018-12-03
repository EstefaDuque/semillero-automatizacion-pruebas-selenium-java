package com.latam.certification.exceptions;

public class CanNotFindFlightDetails extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	private static final String ERROR_SELECT_FLIGHT = "We do not find flight details";
		
	public static String getCanNotFindFlightsDetailsMessage() {
		return ERROR_SELECT_FLIGHT;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public CanNotFindFlightDetails(String message, Throwable cause) {
		super(message, cause);
	}
}


