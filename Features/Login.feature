Feature: Login


  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User open URL "http://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on log out link
    Then Page title should be "Your store. Login"
    And close browser

 Scenario Outline: Login Data Driven
   Given User Launch Chrome browser
   When User open URL "http://admin-demo.nopcommerce.com/login"
   And User enter Email as "<email>" and Password as "<password>"
   And click on Login
   Then Page title should be "Dashboard / nopCommerce administration"
   When User click on log out link
   Then Page title should be "Your store. Login"
   And close browser

   Examples:
   | email | password |
   | admin@yourstore.com | admin |
   | admin1@yourstore.com | admin123 |
