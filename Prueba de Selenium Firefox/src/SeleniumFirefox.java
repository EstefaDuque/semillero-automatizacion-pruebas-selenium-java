//Prueba de selenium con el navegador firefox.

//Importaci�n de librer�as de Selenium.

//Librer�a para el driver.
import org.openqa.selenium.WebDriver;
//Librer�a para abrir el navegador firefox. 
import org.openqa.selenium.firefox.FirefoxDriver;
//Forma de busqueda
import org.openqa.selenium.By;
//-----------------------------------------------

public class SeleniumFirefox {

	public static void main(String[] args) {
		
		//Le estamos indicando a selenium la ubicaci�n del driver para Firefox.
	    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe"); 
		
		// Se instancia el objeto inicial del web driver que controlar� el navegador firefox.
		WebDriver Automat = new FirefoxDriver(); //Para abrir el navegador.
		
		//Abre autom�ticamente una nueva ventana del navegador y busca la p�gina que especifique dentro de sus par�ntesis.
		Automat.get("https://www.google.com.co");
		
		//El m�todo findElement busca un elemento por su nombre, recibiendo como parametro el nombre del elemento.
		//El m�todo sendKeys escribe en el elemento encontrado el string recibido como parametro.
		Automat.findElement(By.name("q")).sendKeys("gmail");
		
		//El m�todo click() se utiliza para simular el clic de cualquier elemento
		Automat.findElement(By.name("btnK")).click();
	}

}
