package com.latam.certification.questions;

//Importación de librerías
//Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
//Components
import com.latam.certification.userinterfaces.LoginComponent;

public class UserNameHeader implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		 return the(LoginComponent.USERNAME).answeredBy(actor).isVisible();
	}

	public static UserNameHeader page(){
		return new UserNameHeader();
	}
	
}
