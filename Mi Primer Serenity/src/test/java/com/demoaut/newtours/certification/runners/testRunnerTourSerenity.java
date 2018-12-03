package com.demoaut.newtours.certification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
/*Ahora el RunWith es con serenity para generar el informe.
Para crear el informe es necesario abrir el cmd, ubicarse en la carpeta del proyecto y ejecutar los comandos:
1) gradle clean
2) gradle aggregate
3)gradle test
4)gradle aggregate
*/
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="Features/LoginSerenity.Feature",
glue="com.demoaut.newtours.certification.StepsDefinition",
plugin=  {"pretty","json:target/json-report/LoginReport.json",
		"html:target/cucumber-reports"}

)

public class testRunnerTourSerenity {

}
