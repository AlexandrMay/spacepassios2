Feature: my_bookings

  Scenario: User is on my_bookings screen
    Given App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Войти" is pressed
    And Enter by Facebook
    Then User is going to MyBookings tab