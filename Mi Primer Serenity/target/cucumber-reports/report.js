$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/LoginSerenity.Feature");
formatter.feature({
  "name": "Login in new torus page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login in new tours",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The new tours page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsDefinition.the_new_tours_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the user and password field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsDefinition.i_fill_the_user_and_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsDefinition.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I acceess to a new page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDefinition.i_acceess_to_a_new_page()"
});
formatter.result({
  "status": "passed"
});
});