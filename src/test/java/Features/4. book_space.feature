Feature: book_space


  Scenario: User is going to book_space screen
    When App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Пропустить" is pressed
    Then User is on the book_space screen
    And First tab is active

  Scenario: User is swipping down the rooms list
    When User is swipping down the rooms list
    Then "Meeting room #2" room in list is invisible

  Scenario: User is going to meeting room screen
    When User is going to meeting room screen
    Then Meeting room screen is visible


  Scenario: User is going to maps screen
    When User is going to maps screen
    Then Maps screen is visible
    And Driver is off






