package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.ios.IOSDriver;

public class OnboardingScreen extends CommonScreenMethods {

    public OnboardingScreen(IOSDriver driver) {
        super(driver);
    }

    String alertAllow = "//XCUIElementTypeButton[@name=\"Разрешить\"]";

    String onboardingText = "//XCUIElementTypeStaticText[@name='%s']";

    String button = "//XCUIElementTypeButton[@name='%s']";

    public void buttonClick (String buttonText) {
        driver.findElementByXPath(String.format(button, buttonText)).click();
    }

    public void alertIsVisibleAndClicked() {
        alertVisibility(alertAllow);
    }

    public String textIsVisible(String text) {return driver.findElementByXPath(String.format(onboardingText, text)).getText();}

}
