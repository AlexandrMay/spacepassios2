package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PolicyScreen extends CommonScreenMethods {
    public PolicyScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Назад\"]")
    private MobileElement backButton;

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Privacy policy\"]")
    private MobileElement header;


    public RegistrationScreen backButtonClick() {
        buttonClick(backButton);
        return new RegistrationScreen(driver);
    }

    public String headerText = getText(header);

}
