package com.latam.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BuyFlightComponent {
	
	public static final Target OFFLINE_PAYMENT_METHOD = Target.the("offline payment method").located(By.id("offline_payment_colombia"));
	public static final Target ONLINE_PAYMENT_METHOD = Target.the("online payment method").located(By.id("online_payment_colombia"));
	public static final Target ACCEPT_CONDITIONS = Target.the("accept conditions").located(By.id("chk_ok"));
	public static final Target FINALIZE_BUY = Target.the("accept conditions button").located(By.name("next_step"));
	public static final Target CASH_PAYMENT = Target.the("Cash payment").located(By.id("titulo_grupo_mp_caja_contenido_OFFLINE"));
	public static final Target PROCESSING_REQUEST = Target.the("processing the request box").located(By.xpath("//td[contains(text(),'Procesando solicitud')]"));


}