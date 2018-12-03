package com.google.certification.runners;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith; //Usamos el lanzador JUnit
import org.openqa.selenium.WebDriver;

import com.google.certification.tasks.ToDoSearch;
import com.google.certification.tasks.OpenBrowser;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
 
@RunWith(SerenityRunner.class)

public class SearchGoogle {
	
	//Crear una instancia de tipo Actor.
    Actor estefa = Actor.named("estefa");
    
    /*Especificarle al administrador del controlador que debe usar el navegador Chrome
    si no se le especifica usa firefox por defecto*/
    @Managed(driver = "chrome")//his o her
    WebDriver herBrowser;
    
    @Before
    public void estefaCanBrowseTheWeb() {
    	//estefa puede abrir el navegador con chrome
        givenThat(estefa).can(BrowseTheWeb.with(herBrowser));
    }
    
    @Test
    //el objetivo de estefa es hacer una busqueda en google.
    public void shouldBeAbleDoaGoogleSearch() {
    	
    	//StartWith.anEmptyTodoList es una tarea.
    	/*Los métodos wasAbleTo () y attemptsTo toman un objeto Task (o una lista de dichos objetos) 
    	y llama sucesivamente al método performAs () para cada tarea.
    	Los métodos "given / when / then" se usan que la intención de una prueba sea
    	más obvia pero no son necesarios*/

    	//Dado que estefa pudo empezar abriendo el navegador
    	givenThat(estefa).wasAbleTo(OpenBrowser.google());
        //Cuando intenta llamar un item a lista de que haceres llamado ....
    	when(estefa).attemptsTo(ToDoSearch.called("Digitize sophos solutions"));

    }
}

