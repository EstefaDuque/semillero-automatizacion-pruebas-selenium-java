$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/BuscarGoogle2.Feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: faniam4@gmail.com"
    }
  ],
  "line": 4,
  "name": "Buscar en Google",
  "description": " Yo quiero usar Google para buscar una cadena",
  "id": "buscar-en-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Realizar una busquedad en Google",
  "description": "",
  "id": "buscar-en-google;realizar-una-busquedad-en-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Inicio el navegador Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Abro la pagina de inicio de Google",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Busco \"Playas mas bonitas de colombia\" en Google",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Valido que realizo la busqueda",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Cierro el navegador2",
  "keyword": "And "
});
formatter.match({
  "location": "BuscarEnGoogle2StepDefinition.inicio_el_navegador_Chrome()"
});
formatter.result({
  "duration": 3386330761,
  "status": "passed"
});
formatter.match({
  "location": "BuscarEnGoogle2StepDefinition.abro_la_pagina_de_inicio_de_Google()"
});
formatter.result({
  "duration": 6250572506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Playas mas bonitas de colombia",
      "offset": 7
    }
  ],
  "location": "BuscarEnGoogle2StepDefinition.busco_en_Google(String)"
});
formatter.result({
  "duration": 4531003310,
  "status": "passed"
});
formatter.match({
  "location": "BuscarEnGoogle2StepDefinition.valido_que_realizo_la_busqueda()"
});
formatter.result({
  "duration": 30018014,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "BuscarEnGoogle2StepDefinition.cierro_el_navegador(int)"
});
formatter.result({
  "duration": 2360411382,
  "status": "passed"
});
});