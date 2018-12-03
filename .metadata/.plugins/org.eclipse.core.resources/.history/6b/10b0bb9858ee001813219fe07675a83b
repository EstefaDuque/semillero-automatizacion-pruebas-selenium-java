package com.casadellibro.certification.runners;

import org.junit.runner.RunWith; //import de junit

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity; //la clase cucumbercon srenity como la clase que va a ejecutar el proyecto

@RunWith(CucumberWithSerenity.class) // Para decile que ejecutaremos un test con junit y utilizaremos la clase cucumbercon srenity como la clase que va a ejecutar el proyecto
									 // ejecuta el test y genera el informe de serenity
@CucumberOptions(features ="src/test/resources/features/select_film.feature",
				 glue	="com.casadellibro.certification.stepdefinitions",
				 snippets= SnippetType.CAMELCASE) //Para que los metodos que mapean los pasos de la notacion gerkin en el fature quedaran con notacion camelcase
				//se especifica dónde está el archivo .feature y la ruta de stepdefinitions para el glue
				
public class SelectFilmRunner {

}
