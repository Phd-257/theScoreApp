Feature: Validate sub-tab of the League

  Scenario Outline: Validate sub-tab of the League
    Given User is on Welcome Page
    And User click on Login from Welcome Page
    Then Verify user is Login Page
    And When User enters email "<Email>" and password "<Password>"
    Then verify user is on home page
    And User clicks on League
    Then Verify User is on League Page
    And User clicks on MLB
    Then User verifies User is on MLB Page
    And User clicks on Standing on MLB Page
    Then Verify user is on Standing Page
    And User clicks on Back Button
    Then Verify User is on League Page

    @test1
    Examples:
      | Email | Password |
      | patel_harsh@myyahoo.com| Harsh@257|
