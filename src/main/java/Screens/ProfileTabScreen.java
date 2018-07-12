package Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ProfileTabScreen extends Tabbar {
    public ProfileTabScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Мой профиль\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"История Операций\"]")
    private MobileElement transactionHistory;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Мои Тарифы\"]")
    private MobileElement myPricePlans;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Мой SPACEPASS\"]")
    private MobileElement mySpacePass;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Настройки\"]")
    private MobileElement settings;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Служба Поддержки\"]")
    private MobileElement support;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"О Приложении\"]")
    private MobileElement about;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Выйти\"]")
    private MobileElement quit;

    @iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Подробнее\"])[1]")
    private MobileElement detailsButton;

    String userData = "//XCUIElementTypeStaticText[@name='%s']";

    public String getUserName(String data) {return driver.findElementByXPath(String.format(userData, data)).getText();}

    public String getUserMail(String data) {return driver.findElementByXPath(String.format(userData, data)).getText();}

    public void logoutClick() {
        buttonClick(quit);
    }

    public void confirmLogout() {
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Выйти\"]").click();
    }

    public ProfileScreen tapToProfile() {
        buttonClick(detailsButton);
        return new ProfileScreen(driver);
    }

    public ProfileSettingsScreen tapToProfileSettings() {
        buttonClick(settings);
        return new ProfileSettingsScreen(driver);
    }

    public ProfileSupportScreen tapToSupport() {
        buttonClick(support);
        return new ProfileSupportScreen(driver);
    }

    public AboutSpacePassScreen tapToAbout() {
        buttonClick(about);
        return new AboutSpacePassScreen(driver);
    }




}
