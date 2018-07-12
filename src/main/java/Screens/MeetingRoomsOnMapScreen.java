package Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Dimension;

public class MeetingRoomsOnMapScreen extends Tabbar {
    public MeetingRoomsOnMapScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Карта\"]")
    private MobileElement header;

    @iOSFindBy(className = "//XCUIElementTypeNavigationBar[@name=\"Карта\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    public BookSpaceScreen tapToBack() {
        buttonClick(backButton);
        return new BookSpaceScreen(driver);
    }


    public void swipeCardToLeft() throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int y =  (int) (size.getHeight()*0.80);
        int x1 = (int)(size.getWidth()*0.90);
        int x2 = (int)(size.getWidth()*0.10);
        driver.swipe(x1, y,x2, y, 1000);
        Thread.sleep(1000);
    }

    String space = "//XCUIElementTypeStaticText[@name='%s']";

    public String getSpaceFromCard(String cardSpace)  {return driver.findElementByXPath(String.format(space, cardSpace)).getText();}
















}
