package com.demoaut.newtours.certification.test;

import java.util.concurrent.TimeUnit;

//Importación de las Librerías


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Libreria para el navegador. Se cambia de acuerdo al navegador usado.
import org.openqa.selenium.chrome.ChromeDriver;
//----------------------------------------------

public class NewtoursLoginPOM {
	
	//Variable Globales.
	WebDriver Carla;
	String nameDriverNavegator,driverLocation,browser;
	
	//La clase WebElement Representa un elemento HTML.
	WebElement elemento;
	
	//Constructor 
	public NewtoursLoginPOM(String nameDriverNavegator, String driverLocation, String browser) {
		
		//Recibe como parametros el nombre del driver y la localización del jar.
		System.setProperty(nameDriverNavegator,driverLocation);
		
		/*Asignar a las variables globales, los parametros recibidos.
		El this sirve para hacer referencia a un metodo o propiedad del objeto actual.*/
		 

		this.nameDriverNavegator=nameDriverNavegator;
		this.driverLocation=driverLocation;
		this.browser=browser;
		openSource(); //Abrir el navegador y el buscador.
		
	}
	
	public void openSource() {
		
		//Instanciar el robot, de acuerdo al navegador usado.
		//El robot se llama Carla.
		Carla = new ChromeDriver(); 
		
		/*implicitlyWait se utiliza para establecer el tiempo de espera predeterminado en 
		todo el programa, evita errores de tipo org.openqa.selenium.NoSuchElementException: no such element
		.*/
		Carla.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Abrir el buscador.
		Carla.get(this.browser);
	}

	//Método para buscar elementos de la pagina.
	public void searchElement(String element) {
		
		elemento=Carla.findElement(By.name(element));
	}
	
	/*Método sendKeys es un método para pasar el contenido o texto a un elemento editable sin reemplazar 
	el contenido disponible anterior.*/
	
	public void writeText() {
		this.elemento.sendKeys("http://newtours.demoaut.com/");
	}
	
	//El método click() se utiliza para simular el clic de cualquier elemento
	public void search() {
		
		this.searchElement("btnK");
		this.elemento.click();
		
	}
	
	//Cierra la instancia.
	public void closeTest() {
		
		Carla.close();
	}
	


}
