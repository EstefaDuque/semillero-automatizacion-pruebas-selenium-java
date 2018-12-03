#Author: your.email@your.domain.com

Feature: Search for a movie
  The user wants to look for a movie on the page

  Scenario: Search for a movie
    Given that the user wants to choose a movie
    When the user manages to select the movie that he wants
    Then the should be able to see the movie that he selects
    