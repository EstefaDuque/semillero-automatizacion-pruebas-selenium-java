$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/buy_movie.feature");
formatter.feature({
  "name": "Buy a movie in casadellibro.com",
  "description": "  As a web user \n  I want to use casadellibro.com \n  to buy a movie",
  "keyword": "Feature"
});
formatter.background({
  "name": "Freyns search and select a movie in casadellibro.com",
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
formatter.step({
  "name": "that the user wants to choose a movie",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchMovieStepDefinitions.thatTheUserWantsToChooseAMovie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user manages to select the movie that he wants",
  "keyword": "When "
});
formatter.match({
  "location": "SearchMovieStepDefinitions.theUserManagesToSelectTheMovieThatHeWants()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he see the deatils",
  "keyword": "When "
});
formatter.match({
  "location": "SelectFilmStepDefinitions.heSeeTheDeatils()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buy the movie DEADPOOL two",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that freyns wants add the movie to the shopping cart",
  "keyword": "Given "
});
formatter.match({
  "location": "BuyMovieStepDefinitions.that_freyns_wants_add_the_movie_to_the_shopping_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he_start_the_purchase",
  "keyword": "When "
});
formatter.match({
  "location": "BuyMovieStepDefinitions.he_start_the_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he verifies that the purchase is in the order summary",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyMovieStepDefinitions.he_verifies_that_the_purchase_is_in_the_order_summary()"
});
formatter.result({
  "status": "passed"
});
});