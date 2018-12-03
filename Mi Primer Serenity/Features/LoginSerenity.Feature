#Author: faniam4@gmail.com

@tag
Feature: Login in new torus page

  @tag1
  Scenario: Login in new tours
  
    Given The new tours page   
    When 	I fill the user and password field
    And 	Click the submit button
    Then 	I acceess to a new page
