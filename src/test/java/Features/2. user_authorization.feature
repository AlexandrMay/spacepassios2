Feature: user_authorization

  Scenario: User is going to the authorization screen
    When App is started and allow to send notifies
    And "Пропустить" is pressed
    And "Войти" is pressed
    Then User is on the user_authorization screen

  Scenario Outline: User is trying to login with invalid creds
    When user is entered <email> and <password>
    Then Error is <error>
    And Fields are cleaned then
    And Driver is off
    Examples:
      |email|password|error|
      |test|test|Укажите корректный e-mail|
      |maysalexandr@gmail.com|test|Неверный логин или пароль|
