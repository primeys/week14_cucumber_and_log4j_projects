Feature: Sainsbury's HomePage
  As a user I want to see all available features on home page

  @Sanity
  Scenario: User should navigate to groceries page
    Given I am on home page
    When I click on groceries link
    Then I can see shoppingWithUsText

