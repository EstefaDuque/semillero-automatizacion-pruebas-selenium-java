$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/select_flight.feature");
formatter.feature({
  "name": "Select a flight in latam",
  "description": "\tAs Alice \n  I want to use latam.com \n  to select a flight",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@selectFlight"
    }
  ]
});
formatter.background({
  "name": "Successful Login in Latam and To look for flights in Latam",
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
formatter.scenario({
  "name": "Select a random flight in latam",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@selectFlight"
    }
  ]
});
formatter.step({
  "name": "she wanted to select a flight randomly",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectFlightStepDefinitions.she_wanted_to_select_a_flight_randomly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she enters the data of the adult passengers",
  "rows": [
    {
      "cells": [
        "adultName",
        "adultLastname",
        "adultIdType",
        "adultIdNumber",
        "adultOrigineCountry"
      ]
    },
    {
      "cells": [
        "Maria Isabel",
        "Restrepo Tobon",
        "Pasaporte",
        "10406073",
        "Colombia"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SelectFlightStepDefinitions.sheEntersTheDataOfTheAdultPassengers(AdultPassenger\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she enters the data of the children passengers",
  "rows": [
    {
      "cells": [
        "childName",
        "childLastname",
        "childIdType",
        "childIdNumber",
        "childOrigineCountry",
        "childBirthDateDay",
        "childBirthDateMonth",
        "childBirthDateYear"
      ]
    },
    {
      "cells": [
        "Emilio",
        "Restrepo Perez",
        "Pasaporte",
        "32873490",
        "Colombia",
        "27",
        "enero",
        "2010"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SelectFlightStepDefinitions.sheEntersTheDataOfTheChildrenPassengers(ChildPassenger\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she enters the data of the babies passengers",
  "rows": [
    {
      "cells": [
        "babyName",
        "babyLastname",
        "babyIdType",
        "babyIdNumber",
        "babyOrigineCountry",
        "babyBirthDateDay",
        "babyBirthDateMonth",
        "babyBirthDateYear"
      ]
    },
    {
      "cells": [
        "Valeria",
        "Restrepo Perez",
        "Pasaporte",
        "2387294",
        "Colombia",
        "03",
        "febrero",
        "2017"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SelectFlightStepDefinitions.sheEntersTheDataOfTheBabiesPassengers(BabyPassenger\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she enters contact information",
  "rows": [
    {
      "cells": [
        "contactEmail",
        "contactPhoneType",
        "contactCountry",
        "contactAreaCode",
        "contactPhoneNumber"
      ]
    },
    {
      "cells": [
        "maria32@gmail.com",
        "Movil",
        "Colombia +57",
        "57",
        "3174545043"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SelectFlightStepDefinitions.sheEntersContactInformation(ContactInformation\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she will verify your reservation",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectFlightStepDefinitions.sheWillVerifyYourReservation()"
});
formatter.result({
  "status": "passed"
});
});