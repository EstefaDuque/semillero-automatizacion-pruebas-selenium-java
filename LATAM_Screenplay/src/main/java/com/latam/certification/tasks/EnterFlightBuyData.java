package com.latam.certification.tasks;


import com.latam.certification.models.BuyData;

import com.latam.certification.userinterfaces.BuyFlightComponent;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

public class EnterFlightBuyData implements Task{
	
	private BuyData buyData;

	public EnterFlightBuyData(BuyData buyData)  {
		this.buyData= buyData;
	}
	@Step("{0} enters he details of the purchase")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Check.whether(this.buyData.getPaymentMethod().equals("Pago presencial")).
	            	andIfSo(Click.on(BuyFlightComponent.OFFLINE_PAYMENT_METHOD)).otherwise(),
	            Check.whether(this.buyData.getPaymentMethod().equals("Pago en linea")).
	                andIfSo(Click.on(BuyFlightComponent.ONLINE_PAYMENT_METHOD)).otherwise(),
	            Click.on(BuyFlightComponent.CASH_PAYMENT),   
				Click.on(BuyFlightComponent.ACCEPT_CONDITIONS),
				Click.on(BuyFlightComponent.FINALIZE_BUY)
				);
	}
	public static EnterFlightBuyData of(BuyData buyData) {
		return Instrumented.instanceOf(EnterFlightBuyData.class)
			.withProperties(buyData);
				
	}
	
}