@Smoke
Feature: Loginfeature

  Scenario: Admin Login
    When I enter a valid username
    And I enter a valid password
    And I click on submit button
    Then I validate that I am logged in
