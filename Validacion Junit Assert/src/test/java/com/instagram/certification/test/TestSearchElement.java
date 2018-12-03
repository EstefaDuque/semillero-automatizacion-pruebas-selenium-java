package com.instagram.certification.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSearchElement {

	public TestSearchElement() {
		// TODO Auto-generated constructor stub
	}
	
	//Busca un boton por medio de su xpath.
	public static WebElement buscarBoton(WebDriver merison) {
		WebElement elemento;
		try {
			elemento=merison.findElement(By.xpath("//a[@class='StaticLoggedOutHomePage-input StaticLoggedOutHomePage-narrowLoginButton EdgeButton EdgeButton--secondary EdgeButton--small u-floatRight']")); 
		}catch(NoSuchElementException e) {
			System.out.println("No se encontro el elemento");
			elemento=null;
		}
		 return elemento;
	}
	
}
