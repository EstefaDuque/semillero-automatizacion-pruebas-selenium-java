$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login in LATAM",
  "description": "  As Alice \n  I want to use latam.com \n  to do login",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginLatam"
    }
  ]
});
formatter.scenario({
  "name": "successful Login in Latam",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginLatam"
    },
    {
      "name": "@tag1"
    },
    {
      "name": "@successfulLogin"
    },
    {
      "name": "@smokeTest"
    }
  ]
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
  "name": "UnSuccessful Login in Latam",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginLatam"
    },
    {
      "name": "@tag2"
    },
    {
      "name": "@wrongUser"
    }
  ]
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
        "semillero@gmail.com",
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
  "error_message": "java.lang.AssertionError: wrong credentials - Expected net.serenitybdd.screenplay.QuestionSubject@3186f8f5\nExpected: is \u003ctrue\u003e\n     but: was \u003cfalse\u003e\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:187)\r\n\tat com.latam.certification.stepdefinitions.LoginStepDefinitions.sheWillVerifyThatSheEnteredCorrectly(LoginStepDefinitions.java:74)\r\n\tat ✽.she will verify that she entered correctly(src/test/resources/features/login.feature:25)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "UnSuccessful Login in Latam",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginLatam"
    },
    {
      "name": "@tag3"
    },
    {
      "name": "@wrongPassword"
    }
  ]
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
        "java"
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
  "error_message": "java.lang.AssertionError: wrong credentials - Expected net.serenitybdd.screenplay.QuestionSubject@647d3279\nExpected: is \u003ctrue\u003e\n     but: was \u003cfalse\u003e\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:187)\r\n\tat com.latam.certification.stepdefinitions.LoginStepDefinitions.sheWillVerifyThatSheEnteredCorrectly(LoginStepDefinitions.java:74)\r\n\tat ✽.she will verify that she entered correctly(src/test/resources/features/login.feature:34)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "UnSuccessful Login in Latam",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginLatam"
    },
    {
      "name": "@tag4"
    },
    {
      "name": "@wrongUserAndPassword"
    }
  ]
});
