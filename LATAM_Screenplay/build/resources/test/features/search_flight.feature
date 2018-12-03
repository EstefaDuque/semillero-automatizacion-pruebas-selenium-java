#Author: faniam4@gmail.com

@searchFlight
Feature: To look for a flight in LATAM
	As Alice 
  I want to use latam.com 
  to do to look for a flight

  Background: Successful Login in Latam
  
  	Given that alice wanted to login 
  	When 	she enters to her account with her information
  	| user  								| password 	|
    |faniam4@gmail.com			|123456789Md|
   	Then  she will verify that she entered correctly 
 
  Scenario: To look for flights in Latam
   
    When alice enters the search criteria
    | origin  	| destination 	|flightTypes|departureDate|adultPassengers|childrenPassengers|babyPassengers|  
   	|Jose Maria Cordova|Gustavo Rojas Pinilla|Solo ida|15/12/2018|1|1|1|
   	
    Then she will verify that she found at least one flight

