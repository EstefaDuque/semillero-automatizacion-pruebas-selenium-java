package com.casadellibro.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BuyMovieComponent {
	
	public static final Target ADD_BUY = Target.the("Add movie button").located(By.xpath("//a[@class='btn05compra purchase-button']"));
	public static final Target START_BUY = Target.the("Buy movie button").located(By.xpath("//a[@title='Iniciar compra']"));
	
}
