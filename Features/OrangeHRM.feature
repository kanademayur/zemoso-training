Feature: Orange HRM Login

  Scenario: Logo Present on OrangeHRM home page
    Given I launch chrome browser
    When I open orangeHRM home page
    Then I verify that the logo present on home page
    And Close browser