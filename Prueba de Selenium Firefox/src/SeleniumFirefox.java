//Prueba de selenium con el navegador firefox.

//Importación de librerías de Selenium.

//Librería para el driver.
import org.openqa.selenium.WebDriver;
//Librería para abrir el navegador firefox. 
import org.openqa.selenium.firefox.FirefoxDriver;
//Forma de busqueda
import org.openqa.selenium.By;
//-----------------------------------------------

public class SeleniumFirefox {

	public static void main(String[] args) {
		
		//Le estamos indicando a selenium la ubicación del driver para Firefox.
	    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe"); 
		
		// Se instancia el objeto inicial del web driver que controlará el navegador firefox.
		WebDriver Automat = new FirefoxDriver(); //Para abrir el navegador.
		
		//Abre automáticamente una nueva ventana del navegador y busca la página que especifique dentro de sus paréntesis.
		Automat.get("https://www.google.com.co");
		
		//El método findElement busca un elemento por su nombre, recibiendo como parametro el nombre del elemento.
		//El método sendKeys escribe en el elemento encontrado el string recibido como parametro.
		Automat.findElement(By.name("q")).sendKeys("gmail");
		
		//El método click() se utiliza para simular el clic de cualquier elemento
		Automat.findElement(By.name("btnK")).click();
	}

}
