package com.instagram.certification.test;

import java.util.concurrent.TimeUnit;

//Importaci�n de librerias.
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//-------------------------

public class TestTwitterButtonLogin {

	private static WebDriver merison;
	private WebElement campo;

	@Before
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", 
							"C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 	
		merison = new ChromeDriver();
		merison.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		merison.get("https://twitter.com/?lang=es");
		

	}
	
	@Test
	
	public void test() {
		
		//Busca el campo de texto
		campo = TestSearchElement.buscarBoton(merison);

		//Valido si encontro o no el boton, depende del resultado muestra un mensaje.
		TestValidationElement.validarEncuentroBoton(campo);
	 
	}
	
	@After
	public void tearDown(){
		
		/*Cerrar ventana. Con el m�todo quit cierra todas las ventanas correspondientes,
		incluyendo las emergentes.
		En cambio el m�todo close solo se cierra la ventana padre*/ 
		merison.quit();
	}	
}
