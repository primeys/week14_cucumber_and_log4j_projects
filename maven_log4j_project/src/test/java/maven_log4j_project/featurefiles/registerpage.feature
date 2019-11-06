
@Registration
Feature: Nop commerce demo register feature
  As a user want to complete register successfully


    Scenario: user should be able to register with all mandatory fields successfully
      Given I am on home page
     When I click on registration link
      And I click on male gender
      And I enter "Jay" in first name field
      And I enter "Patel" in last name field
      And I select day 20  from dropdown list
      And I select month "march" from dropdown list
      And I select year "2006" from dropdown list
      And I enter "abc123@gmail.com" email address in email field
      And I enter company name "JayAmbe"
      And I click on newsletter link
      And I enter password "abc123" in password field
      And I enter confirm password "abc123" in password field
      Then I click on Register Button



