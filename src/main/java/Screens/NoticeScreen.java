package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NoticeScreen extends CommonScreenMethods {
    public NoticeScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Уведомления\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Уведомления\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    public ProfileSettingsScreen tabToBack() {
        buttonClick(backButton);
        return new ProfileSettingsScreen(driver);
    }

    String noticesType = "//XCUIElementTypeStaticText[@name='%s']";

    public String getNoticesType(String type) {return driver.findElementByXPath(String.format(noticesType, type)).getText();}

}
