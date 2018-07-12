Feature: filter

  Scenario: User is going to filter screen
    When App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Пропустить" is pressed
    Then User is on the book_space screen
    And User is going to filter screen

  Scenario: Check default filter settings
    Then User see that default date is today
    And Default time is current
    And Driver is off





