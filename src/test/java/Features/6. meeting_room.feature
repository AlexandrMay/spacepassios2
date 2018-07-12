Feature: meeting_room

  Scenario: User is going to some room
    When App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Пропустить" is pressed
    Then User is on the book_space screen
    And User see "Meeting room #2" room
    And User goes to "Meeting room #2" room
    And User see that the name of header is also "Meeting room #2"

  Scenario: Checking data
    Given User see that booking date is equals to current date
    And He change the data to tomorrow
    When User typing to plus twice and to minus once
    Then he see that time interval is "1 час 30 минут"
    And User set time by pickers
      |9|10|00|
    And he see that time interval is changed to "1 час"
    And Driver is off





