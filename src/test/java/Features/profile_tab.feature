Feature: profile_tab

  Scenario: User is going to profile_tab screen
    When App is started and allow to send notifies for profile_tab feature
    And "Пропустить" is pressed for profile_tab
    And "Войти" is pressed for profile_tab
    Then User is enter credentials and pressed enter button
    |maysalexandr@gmail.com|12345678|
    And User is on the profile_tab screen

  Scenario: Checking of user data
    Then user with valid creds is in system
      |Test User|maysalexandr@gmail.com|

  Scenario: User is logout
    When User pressed logout button
    And He see the alert and confirm logout
    Then User is on welcome_screen
    And Driver is off












