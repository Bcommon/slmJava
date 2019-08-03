@testFirstSeleniumCode
Feature: Smoke test webdriver in Selenium BDD cucumber java framework code

  @somkeTestDriver
  Scenario Outline: test different webdriver with url
    Given "<webdriver>" available in the project path
    Then get "<webdriver>" for test
    And launch driver with "<url>"
    When check "<url>" is launched

    Examples: 
      | webdriver        | url                      |
      | chromedriver.exe | https://www.google.com/  |
      | geckodriver.exe  | https://convertcase.net/ |
      #| msedgedriver.exe | https://www.bing.com/    |
     # | test.exe         | https://www.google.com   |
