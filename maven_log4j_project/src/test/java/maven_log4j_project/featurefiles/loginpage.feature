
@Login
Feature: Nop commerce Demo Login feature
  As a user I want to login into nope commerce website


  Scenario: User should navigate to login page successfully
    Given I am on home page
    When  I click on Login link
    Then I should navigate to login page successfully

  Scenario:  User should login successfully
    Given I am on home page
    When  I click on Login link
    And I enter email address "abc123@gmail.com" into email field
    And I enter password "abc123" into password field
    And I click on login button
    Then I should successfully login to my account

  Scenario Outline: User should not login with invalid credentials
    Given I am on home page
    When  I click on Login link
    And I enter email address "<email>" into email field
    And I enter password "<password>" into password field
    And I click on login button
    Then I should successfully login to my account

    Examples:
      | email            | password |
      | abc123@gmail.com | abc123   |
      | xyz123@gmail.com | xyz123   |
      | pqr123@gmail.com | xyz123   |