#Author: faniam4@gmail.com
#Los Scenario Outline nos permiten introducir variables en nuestros
#Scenarios y as� simplificar pruebas que requieren los mismos pasos 
#pero que pueden tener datos variados.

@tag
Feature: Ingresar al Login de Latam
  Yo quiero iniciar sesion en Latam


  @tag1
  Scenario Outline: Iniciar sesion en Latam
  	Given Que inicio el navegador Chrome
    When 	Abro la pagina de inicio de Latam
   	And   Clickeo en el boton Iniciar sesion
    And   Digito el correo como "<correo>" y la contrasena como "<contrasena>"
   	And 	Clickeo en el boton Ingresar
   	Then  Verifico que haya iniciado sesion con "<resultado>"
   	And 	Cierro la pagina de Latam
  
   Examples: 
   
      | correo  					| contrasena 			|resultado|
      | faniam4@gmail.com |     123456789Md |true			|
      | faniam4@gmail.com |     89 					|false		|
    	| niam4@gmail.com 	|     123456789Md	|false		|
    	| niam4@gmail.com 	|     5456465543	|false		|
    	
      
