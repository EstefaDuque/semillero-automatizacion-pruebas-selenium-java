package com.demoaut.newtours.certification.test; //Paquete de pruebas

//Importaci�n de las Librer�as

//import static org.junit.Assert.*; //Para hacer las validaciones
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//-----------------------------------------------------------------
//Hola lo estoy modificando
//En este proyecto utilizamos Gradle,JUnit con POM

//@ son tags para inyectar c�digo del framework JUnit.

public class NewtoursLogin {
	
	//Variable Globales.
	NewtoursLoginPOM prueba1;// Se crea la variable prueba de tipo NewtoursLoginPOM.
	//------------------------------------------------------------------------------
	
	
	//Antes. Se pone todo lo que vamos hacer una sola vez y antes de la prueba.
	@Before 
	public void setUp() throws Exception {
		
		/* Instanciamos la variable prueba1 y le enviamos 3 parametros al constructor: nombre del driver del navegador,
		   ubicaci�n del driver, buscador*/
		prueba1= new NewtoursLoginPOM("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe",
									  "https://www.google.com.co"); 
	}
	//---------------------------------------------------Aqui finaliza el Before.
	
	//Durante. Se pone todo lo que se va hacer durante la prueba
	@Test
	public void test() {
		
		prueba1.searchElement("q");
		prueba1.writeText();
		prueba1.search();
	}
	
	//----------------------------------------------Aqui finaliza el Test.

	//Despu�s
	@After
	public void tearDown() throws Exception {
		
		//Cierra la instancia.
		prueba1.closeTest();
	}
	//----------------------------------------------Aqui finaliza el Test.
	

}
