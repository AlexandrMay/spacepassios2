package Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MyBookingsScreen extends Tabbar {
    public MyBookingsScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Календарь\"]")
    private MobileElement header;


}
