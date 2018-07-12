Feature: rooms_on_map

  Scenario: User is going to rooms_on_map screen
    When App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Пропустить" is pressed
    And "На карте" is pressed
    Then User is on the rooms_on_map screen


  Scenario: Checking info about meeting rooms
    When User is swipping card
    Then He see that space is "DI Telegraph" in card
    And Driver is off


