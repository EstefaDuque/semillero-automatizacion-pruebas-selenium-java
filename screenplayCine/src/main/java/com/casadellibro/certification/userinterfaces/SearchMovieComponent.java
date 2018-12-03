package com.casadellibro.certification.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchMovieComponent {
	
	public static final Target ALL_PRODUCTS = Target.the("Button all Products").located(By.id("item01"));
	public static final Target MOVIE = Target.the("Button movie").locatedBy("//*[@id=\"submenu\"]/li[4]/a");
	public static final Target ALL_MOVIE = Target.the("Button all movie").locatedBy("//a[@title='Todas las películas']");
	public static final Target CLOSE_DIALOG = Target.the("It closes pop-up message").locatedBy("//*[@id=\"contAvisoCookies\"]/div");
	
}
