@testPOM
Feature: selenium test using page object model

  @googleTest
  Scenario Outline: run selenium test for google in POM
    Given get webdriver for "<browserName>" with "<url>"
    Then type search text in text box and "<searchtext>"
    When verify the search result "<searchtext>"

    Examples: 
      | browserName | url                     | searchtext |
      | chrome      | https://www.google.com/ | apple      |
      | firefox     | https://www.google.com/ | selenium   |
