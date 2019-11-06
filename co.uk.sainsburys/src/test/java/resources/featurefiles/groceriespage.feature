Feature: Sainsbury Grocery feature
    As a user I want to shopping groceries without login

  @Sanity
  Scenario: Continue shopping without login
    Given I am on home page
    And I click on groceries link
    When I click on loginLink
    And  I click on continue shopping
    And I reached to let's check postcode page
    Then I click on postcode field
    And I enter postcode "HA39RZ" into postcode field


