Feature: Validate sub-tab of the League

  Scenario Outline: Validate sub-tab of the League
    Given User logs in with the "<Credentials>"
#    Then verify user is on home page
#    And User clicks Leagues from bottom navigation
#    Then verify user is on the League page
#    And User clicks on "<Game>"
#    Then User verify user is on "<Game>" page
#    And user click on Standings of the game
#    Then Verify user is on Standing sub-tab
#    And user click on back Button
#    Then verify user is on League Page

    @test1
    Examples:
      | Credentials |
      | harsh       |
