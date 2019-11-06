Feature: AugustusMartin About Page features
  As a user I want to see all available tabs on this page

  Scenario: User should navigate to about page successfully
    Given I am on home page
    When I click on about link
    Then I should navigate to about page successfully

  Scenario: User should navigate to quality page successfully
    Given I am on home page
    When I click on about link
    And I click on Quality link page
    Then I should navigate to quality page successfully

  Scenario: User should navigate to Environment page Successfully
    Given I am on home page
    When I click on about link
    And I click on Environment link page
    Then I should navigate to Environment page successfully

