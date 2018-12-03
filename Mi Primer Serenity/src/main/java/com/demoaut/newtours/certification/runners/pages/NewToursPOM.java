//POM Utilizando Page Factory

package com.demoaut.newtours.certification.runners.pages;

import org.openqa.selenium.WebElement;

//Librería para usar la clase By
import net.serenitybdd.core.annotations.findby.FindBy;
//Librería para heredar la clase PageObject
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
//Aqui termina la importación de las librerías
@DefaultUrl("http://newtours.demoaut.com/")

public class NewToursPOM extends PageObject {

	//Mapiar la página, declaración de los elementos html
	
	@FindBy(name="userName")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	//Los metodos sendKeys y senData los proporciona la clase PageObject
	public void writeData(String user, String password) {
		
		this.txtUserName.sendKeys(user);
		this.txtPassword.sendKeys(password);

	}

	public void sendData(String user, String password) {
		this.btnLogin.click();
	}
}
