Feature: Login intoamazon website

 

  Scenario: Positive scenario to test login functionality
    Given User has opened amazon website on Chrome Browser
    When User enters correct username and password
    Then User should be able to login successfully

 

  Scenario: Negative scenario to test login functionality
    Given User has opened amazon website on Chrome Browser
    When User enters incorrect username and password
    Then User should not be able to login successfully