package com.latam.certification.exceptions;

public class WhitOutConnectionToTheLatam extends AssertionError {
	
	private static final long serialVersionUID = 1L;
	private static final String ERROR_NETWORK_CONNECTION = "Without connection to the network";

	public static String getNoLoadsCorrectlyMessage() {
		return ERROR_NETWORK_CONNECTION;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public WhitOutConnectionToTheLatam(String message, Throwable cause) {
		super(message, cause);
	}
}
