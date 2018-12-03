package com.latam.certification.exceptions;

public class NotSuccesfulLogin extends AssertionError{

	private static final long serialVersionUID = 1L;
	private static final String ERROR_LOGIN = "Wrong credentials login";
	
	
	public static String getNotSuccesfulLoginMessage() {
		return ERROR_LOGIN;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public NotSuccesfulLogin(String message, Throwable cause) {
		super(message, cause);
	}
}