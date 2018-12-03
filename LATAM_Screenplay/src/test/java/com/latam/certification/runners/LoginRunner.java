package com.latam.certification.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@RunWith el runner de cucumber con serenity. Ejecuta el test y genera el reporte con serenity.
@RunWith(CucumberWithSerenity.class)

//@CucumberOptions es propio de cucumber. Tiene varias opciones de configuración.
@CucumberOptions(
		
		//Ruta del feature
		features = "src/test/resources/features/login.feature",
		
		//Ruta de los steps definitions
		glue = "com.latam.certification.stepdefinitions",

		//Genera el informe de junit en .json,.html y .xml
		plugin= {"pretty",
				"json:target/json-report/loginReport.json",
				"html:target/login-html-report",
				"junit:target/xml-report/loginReport.xml"},
		
		//SnippetType.CAMELCASE Crea los métodos del feature con la notación lowerCamelCase
		snippets = SnippetType.CAMELCASE,
		
		tags= "@loginLatam"
)
public class LoginRunner {}