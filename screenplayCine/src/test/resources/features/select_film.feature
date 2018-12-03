#Author: juliangebe@gmail.com

Feature: Seleccion de pelicula
		As a web user
		I want to select a movie 
		to see more details

	Background: Search for a movie
    Given that the user wants to choose a movie
    When the user manages to select the movie that he wants
    Then the should be able to see the movie that he selects
    
  Scenario: Select the movie and see the details
    Given that the user wants to select a movie     
    When he see the deatils   
    Then he should see the buy option
    


