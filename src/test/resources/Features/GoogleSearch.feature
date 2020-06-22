Feature: feature to test basic google search

  Scenario: Validate if google search is working fine
    Given Open google chrome
    And user should be on google search page
    When user enters a text in search box
    And hit on enter
    Then user should navigate to specific search page