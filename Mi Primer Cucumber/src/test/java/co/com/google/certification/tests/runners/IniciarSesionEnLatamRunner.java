package co.com.google.certification.tests.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/IniciarSesionLatam.Feature",
glue="co.com.google.certification.tests.stepdefinitions",
tags="@tag1",
plugin=  {"pretty","html:target/cucumber-html-report"}

)

public class IniciarSesionEnLatamRunner {

}
