@HomePage

Feature: Nop Commerce Demo Home Page feature

  As a user I want to see Home Page all functionality

  Scenario: User should navigate to homepage successfully
    Given I am on home page
    Then I can see homepage successfully

  Scenario: User should navigate to LoginPage successfully
    Given I am on home page
    When I click on Login link
    Then I can see LoginPage successfully

  Scenario: User should navigate to RegisterPage successfully
    Given I am on home page
    When I click on registration link
    Then I can see RegisterPage successfully

  Scenario: User should navigate to ComputersPage successfully
    Given I am on home page
    When I click on computers link
    Then I can see ComputersPage successfully

  Scenario: User should navigate to ElectronicsPage successfully
    Given I am on home page
    Then I click on electronics link

  Scenario: User should navigate to ApparelPage successfully
    Given I am on home page
    Then I click on apparel link


  Scenario: User should navigate Digital DownloadsPage successfully
    Given I am on home page
    Then I click on digital downloads link


  Scenario: User should navigate to BooksPage successfully
    Given I am on home page
    Then I click on books link


  Scenario: User should navigate to JewelryPage successfully
    Given I am on home page
    Then I click on jewelry link


  Scenario: User should navigate to Gift CardsPage successfully
    Given I am on home page
    Then I click on gift cards link


  Scenario: User should navigate to WishlistPage successfully
    Given I am on home page
    Then I click on wishlist link

