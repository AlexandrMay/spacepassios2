Feature: user_registration

Scenario: User is going to the registration screen
  When App is started and allow to send notifies
  And "Пропустить" is pressed
  And "НАЧАТЬ" is pressed
  Then User is on the registration screen

  Scenario Outline: User is trying to register with invalid creds
    When user is typing <email> and <password>
    Then email error is equal to <email_error> and password error equal to <password_error>
    And Fields are cleaned
    Examples:
    |email|password|email_error|password_error|
    |test|test|Укажите корректный e-mail|Пароль должен содержать не менее 8 символов|
    |maysalexandr@gmail.com|test|E-mail уже занят|Пароль должен содержать не менее 8 символов|

  Scenario: Show entered password
      When User is entered "test@test.com" email and "12345678" password
      And Click to eye button
      Then He see the password that equals to "12345678"

  Scenario: Go to terms and back
    When User is clicking on terms link
    Then User is on the terms screen
    And User is back

  Scenario: Go to authorization screen
    When User is clicking on account button
    Then User is on the authorization screen
    And He is back to registration
    And Driver is off











