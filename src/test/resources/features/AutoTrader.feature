@smoke_test
Feature:

   @unit_test
   @regression_test
  Scenario: Testing Autotrader.com
    Given User is in landing page
    Then Verify that "Browser By Make" are present
    Then Verify that "Browser By Style" are present
    Then Verify that "Advance Search" are present
    And Verify that search button is present
    Then Verify that "Any Make" and "Any Model" is visible

   @integration_test
   @abc_test
  Scenario: Entering the Advance search link
    Given User click on Advance link on the home page
    Then User enter "30004" in the zip code text box
    Then User select "Certified" check box under "Condition"
    Then User select "Convertible" check box under "Style"
    Then User update year "2017" to "2020"
    Then User select "BMW" car from Make, Model and Trim
    Then User clicks Search Button
    Then User verify that he is in the result page
    Then User verify that he sees only "BMW" cars in listing
    Then Display in console, the number of cars listed in result page


    Scenario Outline: testin the multiple entry
      Given choose make as "<model>"
      Examples:
      |model|
      |BMW|
      |AUDI|
      |Mercedes|
      |Acura|
