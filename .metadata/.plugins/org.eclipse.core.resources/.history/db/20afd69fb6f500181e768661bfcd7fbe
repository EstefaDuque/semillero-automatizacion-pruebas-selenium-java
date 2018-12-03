#Author: faniam4@gmail.com

#La idea en el escenario es decir que se esta haciendo, no como
#Feature
	#Quien
	#Que quiero
	#Para que, el proposito
#Escenario
	#precondition o proposito 
	#Las acciones de la prueba
	#condiciones de verificacion
	
Feature: Buy a movie in casadellibro.com
  
  As a web user 
  I want to use casadellibro.com 
  to buy a movie

    Background: Freyns search and select a movie in casadellibro.com
    
    Given that the user wants to choose a movie
    When the user manages to select the movie that he wants
       
    When he see the deatils   
    
    Scenario: Buy the movie DEADPOOL two
    Given that freyns wants add the movie to the shopping cart 
    When 	he_start_the_purchase 
    Then 	he verifies that the purchase is in the order summary 

    #Given=Dado que freyns quiere agregar la película al carrito de compras
    #When= Cuando el empezo la compra 
    #Then= Él verifica que la compra está en el resumen del pedido.
    