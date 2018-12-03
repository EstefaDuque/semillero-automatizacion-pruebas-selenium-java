#Author: faniam4@gmail.com

#La idea de los feature es decir que se esta haciendo, no como

#Feature
	#Quien
	#Que quiero
	#Para que, el proposito
	
#Scenario
	#Given= #precondicion o proposito 
	#When = #Las acciones de la prueba
	#Then = #condiciones de verificacion

Feature: Google Translate
  As a web user 
  I want to use Google Translate 
  to translate words between differents languages 

    Scenario: Translate from English to Spanish
    Given that susan wants to translate a word 
    When 	she translates I complete action 
    Then 	she should see the word queso in the screen 
