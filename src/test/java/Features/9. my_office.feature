Feature: my_office

  Scenario: User is on my_office screen
    Given App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Войти" is pressed
    And Enter by Facebook
    Then User is going to MyOffice tab