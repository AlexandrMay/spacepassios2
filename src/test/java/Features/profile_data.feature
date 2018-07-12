Feature: profile_data

  Scenario: User is going to profile_data screen
    When App is started and allow to send notifies for profile_data feature
    And "Пропустить" is pressed for profile_data
    And "Войти" is pressed for profile_data
    Then User is enter credentials and pressed enter button for profile_data
      |maysalexandr@gmail.com|12345678|
    And User is on the profile_data screen

  Scenario Outline: Photo adding possibility
    When User is tapping on camera with <index>
    Then User see such buttons as <buttonname1>, <buttonname2> and <buttonname3>
    Examples:
    |index|buttonname1|buttonname2|buttonname3|
    |2    |Снять фото |Медиатека  |Отменить   |
    |3    |Снять фото |Медиатека  |Отменить   |

  Scenario: Checking username
    Then User has such data as
    |Имя|Test|
    |Фамилия|User|
    And Driver is off









