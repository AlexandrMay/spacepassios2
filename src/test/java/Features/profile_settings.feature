Feature: profile_settings

  Scenario: User is going to profile_data screen

    When App is started and allow to send notifies for profile_data feature
    And "Пропустить" is pressed for profile_data
    And "Войти" is pressed for profile_data
    Then User is enter credentials and pressed enter button for profile_data
      |maysalexandr@gmail.com|12345678|
    And User is on the profile_settings screen

  Scenario: Check default settings
      When User has such default settings
      |Русский|Российский рубль|

  Scenario: User is going to notices
      When User is tapping to notices
      Then User is on notices screen and see such types
      |Web|E-Mail|Sms|
      And Go back to profile_settings screen from notices_screen

  Scenario: Checking language
    Given User tap to language
    And See the default language is "Русский"
    When User typing "Eng", check it and press "Готово" button
    And See that "English" is choosen
    Then User is tap to back and press "Отменить" button
    And See that choosen language is "Русский"

  Scenario: Choosen office checking
    When User go to My Office and choosing "DI Telegraph" space
    And Go back to Book Space screen
    Then Space in filter is equals to "DI Telegraph"

  Scenario: User is going to spacepasses
    When User is on spacepasses screen
    Then User is going back from spacepasses screen

  Scenario: User is going to spacepasses
    When User is on PricePlans screen
    Then User is going back from PricePlans screen






