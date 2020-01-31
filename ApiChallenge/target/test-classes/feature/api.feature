Feature: API Test

  Scenario: Wants to see if the call is success
    When i call movies
    Then should be visible the value "200 OK"

  Scenario: i make a resquest whith id user 6
    When i make a call with value "6"
    Then should be visible the name Lee Pong
