package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class ProfileScreen extends CommonScreenMethods {
    public ProfileScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Назад\"]")
    private MobileElement backButton;

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Профиль\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Готово\"]")
    private MobileElement doneButton;

    @iOSFindBy(className = "XCUIElementTypeButton")
    private List<MobileElement> cameraButton;

    @iOSFindBy(className = "XCUIElementTypeTextField")
    private List<MobileElement> userName;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CONTACTS\"]")
    private MobileElement heading;

    String userData = "//XCUIElementTypeStaticText[@name='%s']";

    public String getUserData(String data) {return driver.findElementByXPath(String.format(userData, data)).getText();}

    public String userNameText = getText(userName.get(0));

    public String userSurnameText = getText(userName.get(1));

    String buttonName = "//XCUIElementTypeButton[@name='%s']";

    public String getButtonName(String name) {return driver.findElementByXPath(String.format(buttonName, name)).getText();}

    public void tapToCamera(int index) {
        buttonClick(cameraButton.get(index));
    }

    public void closeAlert() {
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Отменить\"]").click();
    }


}
