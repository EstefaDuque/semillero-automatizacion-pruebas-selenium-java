package com.latam.certification.questions;

//Importación de librerías
//Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
//Components
import com.latam.certification.userinterfaces.LoginComponent;

public class LatamLoads implements Question<Boolean> {

	//Verifica si el boton HOME_BUTTON esta visible por el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(LoginComponent.HOME_IMAGE).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> Correctly() {
		return new LatamLoads();
	}

}
