
package com.google.certification.tasks;
 
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static org.openqa.selenium.Keys.RETURN;

import com.google.certification.ui.HomeGoogleComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ToDoSearch implements Task {
   
	private String item;

	 //Constructor
    public ToDoSearch(String item) {
        this.item = item;
    }
    
    @Override
    //Entre llaves{0} se le envia el actor que definimos en el lanzador.
    /*Puede referirse a las variables miembro en la clase utilizando el signo # delante
    del nombre de la variable miembro*/
    @Step("{0} adds an item called '#item'")
    
    public <T extends Actor> void performAs(T actor) {
    	
    	 actor.attemptsTo(
    			 /*Aquí estoy usando la clase de interacción de la interfaz de usuario de 
    			 Serenity Enter para ingresar un valor particular*/
                 Enter.theValue(item)
                 
                 /*WHAT_NEEDS_TO_BE_DONE es un campo estatico que contiene 
                 el nombre del campo.*/
                 /*El método into es exactamente lo que proporcionaría a un método
                 de Selenium findElement ()*/
                 
                 .into(By.name(HomeGoogleComponent.WHAT_NEEDS_TO_BE_DONE))
                 /*Enum KeysEs la representación de teclas presionables que no son
                 texto*/
                 .thenHit(RETURN)

    	);
    }
   
    public static Performable called(String item) {
        return instrumented(ToDoSearch.class, item);
    }
    
}