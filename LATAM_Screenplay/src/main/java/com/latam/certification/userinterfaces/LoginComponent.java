package com.latam.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginComponent {
	
	/*La clase Target es una forma conveniente de asociar un texto legible por el usuario con una estrategia de ubicación WebDriver.*/
	
	public static final Target CLOSE_POPOVER = Target.the("Close window emergent").located(By.id("onesignal-popover-cancel-button"));
	public static final Target LATAM_LOGIN = Target.the("Latam login button").located(By.xpath("//a[@class='Header-complementaryLink Header-loginBtn']"));
	public static final Target USER = Target.the("Login user txt").located(By.id("login"));
	public static final Target PASSWORD = Target.the("Login password txt").located(By.id("password"));
	public static final Target SUBMIT = Target.the("Login enter button").located(By.id("btnEnter"));
	public static final Target USERNAME = Target.the("User name text").located(By.xpath("//span[@class='Login-launcherName']"));
	public static final Target HOME_IMAGE = Target.the("Home image of Latam page").located(By.xpath("//img[@class='Header-logoImg Header-mainLogo']"));

	
}
