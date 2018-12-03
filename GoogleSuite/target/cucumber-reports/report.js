$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google_translate.feature");
formatter.feature({
  "name": "Google Translate",
  "description": "  As a web user \n  I want to use Google Translate \n  to translate words between differents languages ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Translate from English to Spanish",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that susan wants to translate a word",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.that_susan_wants_to_translate_a_word()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she translates I complete action",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.she_translates_I_complete_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see the word queso in the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.she_should_see_the_word_queso_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
});