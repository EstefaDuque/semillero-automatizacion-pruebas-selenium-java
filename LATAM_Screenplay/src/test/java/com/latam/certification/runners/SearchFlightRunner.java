package com.latam.certification.runners;

//Importación de librerías
//Cucumber
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
//Junit
import org.junit.runner.RunWith;

//@RunWith el runner de cucumber con serenity. Ejecuta el test y genera el informe con serenity.
@RunWith(CucumberWithSerenity.class)

//@CucumberOptions es propio de cucumber. Tiene varias opciones de configuración.
@CucumberOptions(
		
		//Ruta del feature
		features = "src/test/resources/features/search_flight.feature",
		
		//Ruta de los steps definitions
		glue = "com.latam.certification.stepdefinitions",

		//Genera el informe de junit en .json,.html y .xml
		plugin= {"pretty",
				"json:target/json-report/searchFlightReport.json",
				"html:target/searchFlight-html-report",
				"junit:target/xml-report/searchFlight.xml"},
		
		//SnippetType.CAMELCASE Crea los métodos del feature con la notación lowerCamelCase
		snippets = SnippetType.CAMELCASE,
		
		tags= "@searchFlight"
		 )
public class SearchFlightRunner {

}
