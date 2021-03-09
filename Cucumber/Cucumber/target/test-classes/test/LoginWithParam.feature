Feature: Login into amazon website

 

  @Regression
  Scenario Outline: Positive scenario to test login fuctionality
    Given User has opened amazon website on Chrome Browser
    When User enters correct "<username>" and "<password>"
    Then User should be able to login successfully

 

    Examples: 
      | username    | password |
      | abc@xya.com | abc123   |
      | pqr@abc.com | a12322   |

 

  @Sanity
  Scenario Outline: Positive scenario to test login fuctionality
    Given User has opened amazon website on Chrome Browser
    When User enters correct "<username>" and "<password>"
    Then User should be able to login successfully

 

    Examples: 
      | username       | password |
      | poojaa@xya.com | abc123   |

 

  @Regression
  Scenario Outline: Positive scenario to test login fuctionality
    Given User has opened amazon website on Chrome Browser
    When User enters correct "<username>" and "<password>"
    Then User should be able to login successfully

 

    Examples: 
      | username      | password |
      | ppppp@xya.com | abc123   |