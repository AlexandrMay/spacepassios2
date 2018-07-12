package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ProfileSupportScreen extends CommonScreenMethods {
    public ProfileSupportScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Служба Поддержки\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"test in English\"]")
    private MobileElement testInEng;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Задать Вопрос\"]")
    private MobileElement question;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Подробнее\"]")
    private MobileElement button;

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Служба Поддержки\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    public ProfileTabScreen tapToBack() {
        buttonClick(backButton);
        return new ProfileTabScreen(driver);
    }




}
