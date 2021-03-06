package co.com.google.certification.pages;

//Importar librer�as

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;//Librer�a para manipular los elementos de la p�gina web.
import org.openqa.selenium.chrome.ChromeDriver;//Librerias para la manipulaci�n del navegador.
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
//-------------Aqu� termina la importaci�n de librer�as

public class BuscarEnGooglePOM {
	
	
	//Variable Globales.
	WebDriver carla;
	String nameDriverNavegator,driverLocation,browser;
	
	//La clase WebElement Representa un elemento HTML.
	WebElement element;
	
	//Constructor 
	public BuscarEnGooglePOM(String nameDriverNavegator, String driverLocation) {
		
		//Recibe como parametros el nombre del driver y la localizaci�n del jar.
		System.setProperty(nameDriverNavegator,driverLocation);
		
		/*Asignar a las variables globales, los parametros recibidos.
		El this sirve para hacer referencia a un metodo o propiedad del objeto 
		actual.*/

		this.nameDriverNavegator=nameDriverNavegator;
		this.driverLocation=driverLocation;
				
	}
	
	//M�todo para abrir el navegador
	public void openBrowser(String navegador) {
		
		//Instanciar el robot, de acuerdo al navegador usado.
		//El robot se llama Carla.
		
		switch(navegador) {
			case "chrome":
				carla = new ChromeDriver(); 
				break;
			case "firefox":
				carla = new FirefoxDriver();
				break;
			case "explorer":
				carla = new InternetExplorerDriver();
				break;
		}
				
		//Maximiza la ventana del navegador
		//carla.manage().window().maximize();
		
		/*Implicit Wait le dir� al WebDriver que espere cierta cantidad de 
		tiempo antes de que lance una excepci�n de �No Such Element Exception�. 
		La configuraci�n predeterminada es 0. Una vez que configuremos el tiempo,
		el WebDriver esperar� ese tiempo antes de lanzar una excepci�n.*/
		carla.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	//Metodo para abrir una pagina web, dependiendo de la url
	public void openUrl(String url) {
		carla.get(url);
	}
	
	//M�todo para buscar elementos de la pagina segun el m�todo de b�squeda recibido como parametro.
	public WebElement searchElement(String element, String typeSearch) {
		
		try {
			switch(typeSearch) {
			
				case "id":
					this.element=carla.findElement(By.id(element));
					break;
				case "name":
					this.element=carla.findElement(By.name(element));
					break;
				case "xpath":
					this.element=carla.findElement(By.xpath(element));
					break;
				case "linktext":
					this.element=carla.findElement(By.linkText(element));
					break;
				case "css":
					this.element=carla.findElement(By.cssSelector(element));
					break;
			}
		}catch(NoSuchElementException e) {
			
			System.out.println("No se encontro el elemento");
			this.element=null;
		}
		return this.element;
	}

	/*M�todo sendKeys es un m�todo para pasar el contenido o texto a un elemento editable sin reemplazar 
	el contenido disponible anterior.*/
	
	public void writeText(String text) {
		element.sendKeys(text);
	}
	
	//El m�todo click() se utiliza para simular el clic de cualquier elemento
	public void clic(WebElement element) {
		element.click();
	}
	
	public String getTitlePage(){
		return carla.getTitle();
	}
	
	public String getTextElement(){
		return element.getAttribute("value");
	}
	
	public void closeTest() {
		carla.close();
		
	}
		
}
