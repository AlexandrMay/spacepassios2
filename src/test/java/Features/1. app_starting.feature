Feature: app_starting


  @NeedTo
  Scenario: App starting
  When App is started and allow to send notifies

  @NeedTo
  Scenario Outline: Onboarding verification
  Then Screen is visible with <text>
    Examples:
    |text|
    |Бронируйте переговорные комнаты в своем городе, выбирайте рабочие места, покупайте тарифные планы - оплачивайте онлайн!|
    |Управляйте тарифными планами, узнавайте о ближайших бронированиях, связывайтесь с администраторами пространств         |
    |Join a community of 15,00+ coworkers! Meet new people and discover new business opportunities.                        |
    |Chat with people around or contact space administrators.                                                               |
    |Edit your community profile and manage your orders and bookings.                                                       |
    |Бронируйте переговорные комнаты, находите рабочие места, управляйте тарифными планами, связывайтесь с администраторами пространств, расширяйте профессиональную сеть|

    @NeedTo
    Scenario: App off
      Then Driver is off








