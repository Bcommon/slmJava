$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri(".\\src\\test\\feature\\bdd\\slm\\java\\webtest\\GoogleTest.feature");
formatter.feature({
  "name": "selenium test using page object model",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testPOM"
    }
  ]
});
formatter.scenarioOutline({
  "name": "run selenium test for google in POM",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@googleTest"
    }
  ]
});
formatter.step({
  "name": "get webdriver for \"\u003cbrowserName\u003e\" with \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "type search text in text box and \"\u003csearchtext\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the search result \"\u003csearchtext\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browserName",
        "url",
        "searchtext"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://www.google.com/",
        "apple"
      ]
    },
    {
      "cells": [
        "firefox",
        "https://www.google.com/",
        "selenium"
      ]
    }
  ]
});
formatter.scenario({
  "name": "run selenium test for google in POM",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testPOM"
    },
    {
      "name": "@googleTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "get webdriver for \"chrome\" with \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.getWebdriver(String,String)"
});
formatter.write("chrome:::  created");
formatter.write("::: navigated url :::\nhttps://www.google.com/");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type search text in text box and \"apple\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.googleSearch(String)"
});
formatter.write("::: navigated url :::\nhttps://www.google.com/search?source\u003dhp\u0026ei\u003dU0BFXcX7BNilwgPUppvgCA\u0026q\u003dapple\u0026oq\u003dapple\u0026gs_l\u003dpsy-ab.12..0l10.2384.2415..3878...0.0..1.205.757.0j3j1......0....1..gws-wiz.....0.NLWVkWKdND0\u0026ved\u003d0ahUKEwiF8Y6Gn-bjAhXYknAKHVTTBowQ4dUDCAU\n");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the search result \"apple\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.verifySearchResult(String)"
});
formatter.write("::: Search Text :::\napple");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "run selenium test for google in POM",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testPOM"
    },
    {
      "name": "@googleTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "get webdriver for \"firefox\" with \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.getWebdriver(String,String)"
});
formatter.write("firefox:::  created");
formatter.write("::: navigated url :::\nhttps://www.google.com/");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type search text in text box and \"selenium\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.googleSearch(String)"
});
formatter.write("::: navigated url :::\nhttps://www.google.com/search?source\u003dhp\u0026ei\u003dY0BFXYSdH4-8vASw-6fYDA\u0026q\u003dselenium\u0026oq\u003dselenium\u0026gs_l\u003dpsy-ab.12..0l8j0i131j0.961.1019..2213...0.0..0.213.737.0j4j1......0....1..gws-wiz.....0.vSOrmTdTX_4\u0026ved\u003d0ahUKEwjE2vmNn-bjAhUPHo8KHbD9CcsQ4dUDCAU\n");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the search result \"selenium\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.verifySearchResult(String)"
});
formatter.write("::: Search Text :::\nselenium");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});