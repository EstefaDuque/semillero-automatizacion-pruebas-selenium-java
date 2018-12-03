package com.latam.certification.exceptions;

public class CanNotProcessingFlightRequest extends AssertionError {
	
	private static final long serialVersionUID = 1L;
	private static final String ERROR_BUY_FLIGHT = "We do not find the flight code";
	
	public static String getCanNotProcessingFlightRequestMessage() {
		return ERROR_BUY_FLIGHT;
	}
	//Constructor que llama al constructor de la clase padre AssertionError
	public CanNotProcessingFlightRequest(String message, Throwable cause) {
		super(message, cause);
	}
}