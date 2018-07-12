package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AboutSpacePassScreen extends CommonScreenMethods {
    public AboutSpacePassScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"О Приложении\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"О Приложении\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    @iOSFindBy(xpath = "//XCUIElementTypeImage[@name=\"illustrationAboutSpaceIn\"]")
    private MobileElement label;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SPACEPASS\"]")
    private MobileElement staticText1;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Версия 1.1\"]")
    private MobileElement staticText2;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Политика и условия\"]")
    private MobileElement policyLink;


    public ProfileTabScreen tapToBack() {
        buttonClick(backButton);
        return new ProfileTabScreen(driver);
    }

}
