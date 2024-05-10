
Feature: To find the page objects

  @PageObject
  Scenario: Find the Page Objects
    Given User loged into the greenKart WebSite
    When User Entered vegies <name> in search box
    Then Results has been displayed
Examples:
|name|
|tom |