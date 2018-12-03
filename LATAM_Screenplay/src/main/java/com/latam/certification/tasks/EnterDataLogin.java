package com.latam.certification.tasks;

//Importación de librerías
//Serenity
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
//Components
import com.latam.certification.userinterfaces.LoginComponent;
//Models
import com.latam.certification.models.LoginModel;

public class EnterDataLogin implements Task {
	
	private LoginModel loginData;

	public EnterDataLogin(LoginModel loginData) {
		this.loginData= loginData;
	}
	
	@Step("{0} enter the data to login")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(this.loginData.getUser()).into(LoginComponent.USER),
				Enter.theValue(this.loginData.getPassword()).into(LoginComponent.PASSWORD),
				Click.on(LoginComponent.SUBMIT)
		);
	}

	public static EnterDataLogin of(LoginModel loginData) {
		return Instrumented.instanceOf(EnterDataLogin.class)
			.withProperties(loginData);
				
	}
	

}
