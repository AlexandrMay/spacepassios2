package Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class MyOfficeScreen extends Tabbar {
    public MyOfficeScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Мой Офис\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"DI Telegraph\"]")
    private MobileElement space;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Предстоящие бронирования\"]")
    private MobileElement heading;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Показать все\"]")
    private MobileElement showAll;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Справочник Пространства\"]")
    private MobileElement spravotchnick;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Задать Вопрос\"]")
    private MobileElement askAquestion;

    @iOSFindBy(className = "XCUIElementTypeCell")
    private List<MobileElement> bookings;

    public ProlongScreen tapToProlong() {
        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Продлить\"]").click();
        return new ProlongScreen(driver);
    }

    public void tapToBooking(int index) {
        buttonClick(bookings.get(index));
    }



}
