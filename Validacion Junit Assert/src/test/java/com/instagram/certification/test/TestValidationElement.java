package com.instagram.certification.test;

//Importaci�n libreria Assert
import static org.junit.Assert.assertNotNull; //Para el m�todo assertNotNull.
import static org.junit.Assert.assertNull;//Para el m�todo assertNull.
//-----------------------------------
import org.openqa.selenium.WebElement;

/*Clase Assert: JUnit proporciona m�todos est�ticos en la clase Assert para probar ciertas
condiciones. 
Estos m�todos de afirmaci�n t�picamente comienzan con assert y le permiten especificar 
el mensaje de error, el esperado y el resultado real. 
Un m�todo afirmaci�n compara el valor real devuelto por una prueba para el valor esperado,
y se produce una AssertionException si la prueba de comparaci�n falla.*/

public class TestValidationElement {

	public TestValidationElement() {
	}
	
	public static void validarEncuentroBoton(WebElement elemento){
	
        /*El m�todo assertNull Afirma que un objeto es nulo. 
        Si no lo es, AssertionError se lanza un mensaje con el mensaje dado.*/
		assertNull("Se encontro el elemento en la p�gina",elemento);
		
		/*El m�todo assertNotNull Afirma que un objeto no es nulo.
		Si no lo es, AssertionError se lanza un mensaje con el mensaje dado.*/
	    assertNotNull("No se encontro el elemento en la p�gina",elemento);
	    
	    /*En este ejemplo como si encuentra el elemento, entonces se dispara el assertNull*/
	}

}
