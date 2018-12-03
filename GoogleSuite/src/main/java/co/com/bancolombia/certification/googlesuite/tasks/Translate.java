package co.com.bancolombia.certification.googlesuite.tasks;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Translate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),//Click en las opciones del lenguaje de origen.
				Click.on(GoogleTranslatePage.SOURCE_LANGUAJE),//Click en el lenguaje de origen que vamos a escoger.
				Click.on(GoogleTranslatePage.TARGET_LANGUAJE_OPTION),//Click en las opciones del lenguaje destino.
				Click.on(GoogleTranslatePage.TARGET_LANGUAJE),//Click en el lenguaje destino que vamos a escoger.
				Enter.theValue("cheese").into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA),//Ingresamos la palabra que queremos traducir en el campo de texto
				Click.on(GoogleTranslatePage.TRANSLATE_BUTTON)// Le damos click en el boton traducir.
				);
	}

	public static Translate the() {
		return instrumented(Translate.class);
	}

}
