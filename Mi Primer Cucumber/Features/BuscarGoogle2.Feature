#Author: faniam4@gmail.com

@tag
Feature: Buscar en Google
   Yo quiero usar Google para buscar una cadena

  @tag1
  Scenario: Realizar una busquedad en Google
    Given Inicio el navegador Chrome
    When 	Abro la pagina de inicio de Google
    And  	Busco "Playas mas bonitas de colombia" en Google
    Then 	Valido que realizo la busqueda
    And  	Cierro el navegador2
   