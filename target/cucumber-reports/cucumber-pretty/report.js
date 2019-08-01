$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri(".\\src\\test\\feature\\bdd\\slm\\java\\webtest\\FirstSelenium.feature");
formatter.feature({
  "name": "Smoke test webdriver in Selenium BDD cucumber java framework code",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@testFirstSeleniumCode"
    }
  ]
});
formatter.scenarioOutline({
  "name": "test different webdriver with url",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@somkeTestDriver"
    }
  ]
});
formatter.step({
  "name": "\"\u003cwebdriver\u003e\" available in the project path",
  "keyword": "Given "
});
formatter.step({
  "name": "get \"\u003cwebdriver\u003e\" for test",
  "keyword": "Then "
});
formatter.step({
  "name": "launch driver with \"\u003curl\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "check \"\u003curl\u003e\" is launched",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "webdriver",
        "url"
      ]
    },
    {
      "cells": [
        "chromedriver.exe",
        "https://www.google.com/"
      ]
    },
    {
      "cells": [
        "geckodriver.exe",
        "https://convertcase.net/"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test different webdriver with url",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testFirstSeleniumCode"
    },
    {
      "name": "@somkeTestDriver"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"chromedriver.exe\" available in the project path",
  "keyword": "Given "
});
formatter.match({
  "location": "FirstSeleniumPrg.checkDriverFile(String)"
});
formatter.write("Full webdriver project path : ./src/test/resources/driver/chromedriver.exe");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get \"chromedriver.exe\" for test",
  "keyword": "Then "
});
formatter.match({
  "location": "FirstSeleniumPrg.getDriver(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "launch driver with \"https://www.google.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "FirstSeleniumPrg.launchURL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check \"https://www.google.com/\" is launched",
  "keyword": "When "
});
formatter.match({
  "location": "FirstSeleniumPrg.checkURL(String)"
});
formatter.write("CurrentUrl : https://www.google.com/");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "test different webdriver with url",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@testFirstSeleniumCode"
    },
    {
      "name": "@somkeTestDriver"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"geckodriver.exe\" available in the project path",
  "keyword": "Given "
});
formatter.match({
  "location": "FirstSeleniumPrg.checkDriverFile(String)"
});
formatter.write("Full webdriver project path : ./src/test/resources/driver/geckodriver.exe");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get \"geckodriver.exe\" for test",
  "keyword": "Then "
});
formatter.match({
  "location": "FirstSeleniumPrg.getDriver(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "launch driver with \"https://convertcase.net/\"",
  "keyword": "And "
});
formatter.match({
  "location": "FirstSeleniumPrg.launchURL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check \"https://convertcase.net/\" is launched",
  "keyword": "When "
});
formatter.match({
  "location": "FirstSeleniumPrg.checkURL(String)"
});
formatter.write("CurrentUrl : https://convertcase.net/");
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});