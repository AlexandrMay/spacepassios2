package Screens;


import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;


public class ProfileSettingsScreen extends Tabbar {
    public ProfileSettingsScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Настройки\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Настройки\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Язык\"]")
    private MobileElement language;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Валюта\"]")
    private MobileElement currency;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Уведомления\"]")
    private MobileElement notes;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Мой офис\"]")
    private MobileElement myOffice;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"(пространство, отображаемое по умолчанию в разделе Мой Офис)\"]")
    private MobileElement staticText;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Сменить пароль\"]")
    private MobileElement changePassword;

    String defaultSettings = "//XCUIElementTypeStaticText[@name='%s']";

    public String getDefaultSettings(String setting) {return driver.findElementByXPath(String.format(defaultSettings, setting)).getText();}

    public NoticeScreen tapToNotices() {
        buttonClick(notes);
        return new NoticeScreen(driver);
    }

    public LanguageSetupScreen tapToLanguage() {
        buttonClick(language);
        return new LanguageSetupScreen(driver);
    }

    public void tapToMyOffice() {
        buttonClick(myOffice);
    }

    String myOfficeChoosed = "//XCUIElementTypeStaticText[@name='%s']";

    public void choosingMyOffice(String office) {
    driver.findElementByXPath(String.format(myOfficeChoosed, office)).click();
    }

    public ProfileSettingsScreen backButtonClick() {
        driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"Пространства\"]/XCUIElementTypeButton").click();
        return this;
    }



}



