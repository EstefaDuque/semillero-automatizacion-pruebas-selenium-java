package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	//El tipo de dato Target es para que aparezca en los informes.
	//Target.the se le envia como parametro una descripcion del elemento.
	public static final Target GOOGLE_APPS = Target.the("Google apps button ").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Trasnslate Option").located(By.id("gb51"));
}
