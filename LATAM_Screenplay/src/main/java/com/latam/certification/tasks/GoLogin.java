package com.latam.certification.tasks;

//Importación de librerías
//Serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
//Step
import net.thucydides.core.annotations.Step;
//Se usa static para que cuando llamemos el metodo no haya que anteponerle el nombre de la clase.
import static net.serenitybdd.screenplay.Tasks.instrumented;
//Components
import com.latam.certification.userinterfaces.LoginComponent;

public class GoLogin implements Task {

	@Step("{0} login on the page")

	@Override
	public <T extends Actor> void performAs(T actor) {
		//El metodo attemptsTo recibe acciones.
		actor.attemptsTo(
				Click.on(LoginComponent.CLOSE_POPOVER),//Cerrar ventana emergente
				Click.on(LoginComponent.LATAM_LOGIN));// Dar click en el boton iniciar sesion
	}

	public static GoLogin theApp() {
		return instrumented(GoLogin.class);
	}
}