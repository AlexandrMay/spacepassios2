Feature: booking

  Scenario: User is trying to book a room by card
    Given App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Войти" is pressed
    And Enter by Facebook
    When User see "Переговорка №2" room
    And User goes to "Переговорка №2" room
    And He change the data to tomorrow
    Then User press booking button
    And Confirm booking and see "PayU" signing, and press to Cancel

    Scenario: User is trying to book a room by price plan
      When User is change the date to "2" days before today
      And Using My Price Plans for payment
      And Confirm booking

  Scenario: User is trying to book a room by space pass
    When User is change the date to "3" days before today
    And Using My Space Pass for payment
    And Confirm booking
    And Driver is off


