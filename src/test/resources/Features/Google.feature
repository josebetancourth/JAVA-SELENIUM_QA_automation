@Grid
Feature: test google search functionality

  Scenario: As a user I enter a search criteria in google
    Given I am on the google search page
    When I enter a search criteria
    And Click on the search button
    Then the results match criteria