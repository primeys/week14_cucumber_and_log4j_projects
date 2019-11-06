Feature: Matalan My Account feature

  As a user I want to login into matalan website

  Scenario: User should navigate to myAccount page successfully
    Given I am on home page
    When I click on myAccount link

    Scenario: User should navigate to myAccount page successfully
    Given I am on home page
    When I click on myAccount link
    And I enter email address "abc123@gmail.com" into email field
    And I enter password "abc1234" into password field
    And I click on login button
    Then I should successfully login to my account


#  Scenario Outline: User should not login with invalid credentials
#    Given I am on home page
#    When I click on myAccount link
#    And I enter email address"<email>"into email field
#    And I enter password"<password>" into password field
#    And I click on login button
#    Then I should successfully login to my account
#
#    Examples:
#      | email            | password |
#      | abc12@gmail.com  | jay123   |
#      | abc123@gmail.com | jay1236  |
#      | abc124@gmail.com | jay123   |





