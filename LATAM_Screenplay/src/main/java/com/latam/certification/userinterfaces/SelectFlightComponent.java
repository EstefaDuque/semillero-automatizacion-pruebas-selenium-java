package com.latam.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFlightComponent {
	
	public static final Target FLIGHT_LIST = Target.the("List of flight").located(By.className("flight"));
	public static final Target CONTINUE_INFORMATION_PASSENGER = Target.the("Continue the reservation button").located(By.xpath("//button[@id='submit-flights']"));
	
	//Campos de los pasajeros adultos.
	public static final Target ADULT_NAME = Target.the("Name adult passenger").located(By.name("adult-0.name"));
	public static final Target ADULT_LASTNAME = Target.the("Lastname adult passenger").located(By.name("adult-0.surname"));
	public static final Target ADULT_ID_TYPE_PASSPORT = Target.the("ID Type passport adult passenger").located(By.xpath("//section[@id='adult-0']//div//div[@class='radio-button-group']//div[2]"));
	public static final Target ADULT_ID_TYPE_CC = Target.the("ID Type cc adult passenger").located(By.xpath("//section[@id='adult-0']//div//div[@class='col-md-6']//div[1]//div[1]"));
	public static final Target ADULT_ID_NUMBER = Target.the("ID Number adult passenger").located(By.name("adult-0.documentNumber"));
	public static final Target ADULT_ORIGIN_COUNTRY = Target.the("Origin country adult passenger").located(By.name("adult-0.documentCountryCode"));
	
	//Campos de los pasajeros ni�os.
	public static final Target CHILD_NAME = Target.the("Name child passenger").located(By.name("child-0.name"));
	public static final Target CHILD_LASTNAME = Target.the("Lastname child passenger").located(By.name("child-0.surname"));
	public static final Target CHILD_ID_TYPE_PASSPORT = Target.the("ID Type passport child passenger").located(By.xpath("//section[@id='child-0']//div//div[@class='radio-button-group']//div[2]"));
	public static final Target CHILD_ID_TYPE_CC = Target.the("ID Type cc child passenger").located(By.xpath("//section[@id='child-0']//div//div[@class='col-md-6']//div[1]//div[1]"));
	public static final Target CHILD_ID_NUMBER = Target.the("ID Number child passenger").located(By.name("child-0.documentNumber"));
	public static final Target CHILD_ORIGIN_COUNTRY = Target.the("Origin country child passenger").located(By.name("child-0.documentCountryCode"));
	public static final Target CHILD_BIRTH_DATE_DAY = Target.the("Birth date day child passenger").located(By.name("child-0.birthDate.day"));
	public static final Target CHILD_BIRTH_DATE_MONTH = Target.the("Birth date month child passenger").located(By.name("child-0.birthDate.month"));
	public static final Target CHILD_BIRTH_DATE_YEAR = Target.the("Birth date year child passenger").located(By.name("child-0.birthDate.year"));
	
	//Campos de los pasajeros bebes.
	public static final Target BABY_NAME = Target.the("Name baby passenger").located(By.name("infant-0.name"));
	public static final Target BABY_LASTNAME = Target.the("Lastname baby passenger").located(By.name("infant-0.surname"));
	public static final Target BABY_ID_TYPE_PASSPORT = Target.the("ID Type passport baby passenger").located(By.xpath("//section[@id='infant-0']//div[@class='radio-button-group']//div[2]"));
	public static final Target BABY_ID_TYPE_CC = Target.the("ID Type cc baby passenger").located(By.xpath("//section[@id='infant-0']//div[@class='col-md-6']//div[1]//div[1]"));
	public static final Target BABY_ID_NUMBER = Target.the("ID Number baby passenger").located(By.name("infant-0.documentNumber"));
	public static final Target BABY_ORIGIN_COUNTRY = Target.the("Origin country baby passenger").located(By.name("infant-0.documentCountryCode"));
	public static final Target BABY_BIRTH_DATE_DAY = Target.the("Birth date day baby passenger").located(By.name("infant-0.birthDate.day"));
	public static final Target BABY_BIRTH_DATE_MONTH = Target.the("Birth date month baby passenger").located(By.name("infant-0.birthDate.month"));
	public static final Target BABY_BIRTH_DATE_YEAR = Target.the("Birth date year baby passenger").located(By.name("infant-0.birthDate.year"));

	////Campos del contacto en general.
	public static final Target CONTACT_EMAIL = Target.the("Contact email").located(By.name("contact.email"));
	public static final Target CONTACT_PHONE_TYPE_MOVIL = Target.the("Contact phone type movil").located(By.xpath("//section[@id='contact']//div[@class='row clearfix']//div[1]//div[1]//div[1]"));
	public static final Target CONTACT_PHONE_TYPE_FIJO = Target.the("Contact phone type fijo").located(By.xpath("//section[@id='contact']//div[@class='radio-button-group']//div[2]"));
	public static final Target CONTACT_COUNTRY = Target.the("Contact country").located(By.name("contact.phoneCountryCode"));
	public static final Target CONTACT_AREA_CODE = Target.the("Contact area code").located(By.name("contact.phoneAreaCode"));
	public static final Target CONTACT_PHONE_NUMBER = Target.the("Contact phone number").located(By.name("contact.phoneNumber"));
	
	public static final Target SEND_INFORMATION = Target.the("Send passenger information").located(By.xpath("//button[@value='Continuar']"));
	public static final Target FLIGHT_DETAILS = Target.the("Flight details").located(By.className("table-details"));

}	