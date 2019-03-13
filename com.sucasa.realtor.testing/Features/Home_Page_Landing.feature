@homepage
Feature: Navigation to home page

  @homepage
  Scenario: Navigate to home page
    Given Browser is open
    When I enter the sucasa url
    Then I should navigate to the home page
	  And close the browser