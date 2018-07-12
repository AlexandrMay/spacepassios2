package Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Dimension;

import java.util.List;

public class MeetingRoomScreen extends Tabbar {
    public MeetingRoomScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"ЗАБРОНИРОВАТЬ\"]")
    private MobileElement bookButton;

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Meeting room #2\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Дата бронирования\"]")
    private MobileElement bookingDate;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"plus\"]")
    private MobileElement plusButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"minus\"]")
    private MobileElement minusButton;

    @iOSFindBy(className = "XCUIElementTypePickerWheel")
    private List<MobileElement> dataPicker;

    public void swipeDownAlittle() throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth()/2;
        int y1 = (int)(size.getHeight()*0.60);
        int y2 = (int)(size.getHeight()*0.20);
        driver.swipe(x, y1,x, y2, 750);
        Thread.sleep(1000);
    }

    String siging = "//XCUIElementTypeOther[@name='%s']";

    public String getSiging(String text) {return driver.findElementByXPath(String.format(siging, text)).getText();}

    String headerName = "//XCUIElementTypeOther[@name='%s']";

    String timeInterval = "//XCUIElementTypeStaticText[@name='%s']";

    public String getTimeInterval(String interval) {return driver.findElementByXPath(String.format(timeInterval, interval)).getText();}

    public String getHeaderName(String name) {return driver.findElementByXPath(String.format(headerName, name)).getText();}

    String bookDate = "//XCUIElementTypeStaticText[@name='%s']";

    public String getBookDate(String date) {return driver.findElementByXPath(String.format(bookDate, date)).getText();}

    public void tapTooBookData() {
        buttonClick(bookingDate);
    }

    public void tapToPlus() {
        buttonClick(plusButton);
    }

    public void tapToMinus() {
        buttonClick(minusButton);
    }

    public void setAnyDay(int dayQty) {
        dataPicker.get(0).sendKeys(someDate("d", dayQty));
    }

    public void tapToBegin() {
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Начало\"]").click();
    }

    public void tapToEnd() {
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Окончание\"]").click();
    }

    public void setHours(String hours) {
        dataPicker.get(0).sendKeys(hours);
    }

    public void setMinutes(String minutes) {
        dataPicker.get(1).sendKeys(minutes);
    }

    public void pressBooking() {
        buttonClick(bookButton);
    }

    public void confirmBooking() {
        driver.findElementByAccessibilityId("checkboxOff").click();
        driver.findElementByAccessibilityId("ОПЛАТИТЬ").click();
    }

    public void pressCancel() {
        driver.findElementByAccessibilityId("Cancel").click();
    }


    //setting type of payment

    public void settingTypeOfPayment(int index) {
        driver.findElementByAccessibilityId("Подробнее").click();
        driver.findElementsByClassName("XCUIElementTypeCell").get(index).click();
    }

    public BookSpaceScreen tapToBack() {
        buttonClick(backButton);
        return new BookSpaceScreen(driver);
    }




}
