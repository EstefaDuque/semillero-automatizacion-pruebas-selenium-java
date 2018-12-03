package com.casadellibro.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SelectMovieComponent {
	
	public static final Target SELECT_MOVIE = Target.the("Selecting the movie").located(By.xpath("//a[contains(text(),'DEADPOOL 2 - BLU RAY -')]")); //Final porque es constante, target es el tipo de objeto
	public static final Target SELECT_MORE_DETAILS = Target.the("Selecting more details").located(By.xpath("//a[@title='Ver opiniones de DEADPOOL 2 - BLU RAY -']"));
}
