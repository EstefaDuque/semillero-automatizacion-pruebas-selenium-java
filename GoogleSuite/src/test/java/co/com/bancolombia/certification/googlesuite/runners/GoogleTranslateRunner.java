package co.com.bancolombia.certification.googlesuite.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@RunWith Ejecuta el test y genera el informe con serenity.
@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
		//Ruta del feature
		features = "src/test/resources/features/google_translate.feature",
		
		//Ruta de los steps definitions
		glue = "co.com.bancolombia.certification.googlesuite.stepdefinitions",
		
		//snippets es para crear los metodos del feature con la notación lowerCamelCase
		snippets = SnippetType.CAMELCASE,
		//Para el informe
		plugin=  {"pretty","json:target/json-report/LoginReport.json",
			"html:target/cucumber-reports"}
		 )
public class GoogleTranslateRunner {}
