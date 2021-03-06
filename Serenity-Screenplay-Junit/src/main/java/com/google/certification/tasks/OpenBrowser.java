
package com.google.certification.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.certification.ui.ApplicationHomePage;

public class OpenBrowser implements Task {
	
	//Crear instancia de la clase que implementa el pageObject
    ApplicationHomePage applicationHomePage;

    @Override
    //Cualquier instancia de task debe implementar el metodo perfomAs
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        		//El m�todo the esta buscando un objeto de pagina.
                Open.browserOn().the(applicationHomePage)
        );
    }

    public static OpenBrowser google() {
    	/*instrumented()m�todo, para que la tarea y las acciones subyacentes aparezcan 
    	en los informes de Serenity*/
        return instrumented(OpenBrowser.class);
    }
}