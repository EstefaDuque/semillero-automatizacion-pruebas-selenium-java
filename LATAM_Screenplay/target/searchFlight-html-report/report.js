$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/search_flight.feature");
formatter.feature({
  "name": "To look for a flight in LATAM",
  "description": "\tAs Alice \n  I want to use latam.com \n  to do to look for a flight",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@searchFlight"
    }
  ]
});
formatter.background({
  "name": "Successful Login in Latam",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that alice wanted to login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.thatAliceWantedToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she enters to her account with her information",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ]
    },
    {
      "cells": [
        "faniam4@gmail.com",
        "123456789Md"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.sheEntersToHerAccountWithHerInformation(LoginModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she will verify that she entered correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.sheWillVerifyThatSheEnteredCorrectly()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To look for flights in Latam",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@searchFlight"
    }
  ]
});
formatter.step({
  "name": "alice enters the search criteria",
  "rows": [
    {
      "cells": [
        "origin",
        "destination",
        "flightTypes",
        "departureDate",
        "adultPassengers",
        "childrenPassengers",
        "babyPassengers"
      ]
    },
    {
      "cells": [
        "Jose Maria Cordova",
        "Gustavo Rojas Pinilla",
        "Solo ida",
        "15/12/2018",
        "1",
        "1",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchFlightStepDefinitions.aliceEntersTheSearchCriteria(SearchDataFlight\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she will verify that she found at least one flight",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFlightStepDefinitions.sheWillVerifyThatSheFoundAtLeastOneFlight()"
});
formatter.result({
  "status": "passed"
});
});