Feature: profile_support_about

  Scenario: User is going to profile_settings screen
    When App is started and allow to send notifies for profile_tab feature
    And "Пропустить" is pressed for profile_tab
    And "Войти" is pressed for profile_tab
    Then User is enter credentials and pressed enter button
      |maysalexandr@gmail.com|12345678|
    And User is on the profile_tab screen

    Scenario: User is going to support screen
      When User is tap to support
      Then User is on the support screen
      And User is tap to back from support screen

  Scenario: User is going to about screen
    When User is tap to about
    Then User is on the about screen
    And User is tap to back from about screen
    And Driver is off



