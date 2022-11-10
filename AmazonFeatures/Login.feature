Feature: Login Amazon.in

  Background: Open Amazon Website
    Given User Launch Chrome browser
    When user enter url "https://www.amazon.in/"

  @withoutLogin
  Scenario Outline: Without Login.

    When User click on Todays Deal
    And User click on Third deal
    And click on first Item
    And Add minimum quantity
    And click on Add to cart button
    And click on cart button
    Then verify quantity as "1"
    When search the "mobile"
    Then mobile page is visible
    When Scroll down the page
    And Get the last displayed item details.
    And click on left navigation
    And close the browser.

    Examples:
      | baseURL |
    | https://www.amazon.in/ |

  @withLogin
  Scenario Outline: With Login.

      When click on signup option
      And User enter Email as "<email>" and Password as "<password>"
      And click on Login
      Then select the prime delivery checkbox
      And get the first item delivery date
      When click on your order
      And select past one year order
      When click on Account
      And click on Add payment option
      Then Verify payment option is added
      When click on account
      And click on Add address option
      And add the address as "<name>" ,"<homephone>" , "<pinCode>" ,"<house>" ,"<street>" and "<landMark>"
      Then verify address is added
      And close the browser.
      Examples:
         | email | password | name | homephone | pinCode | house | street | landMark |
         | 9673146895 | 9673146895 | Mayur | 9511662728 | 422305 | a/p vinchur | kanade wasti | Tal.Niphad |






