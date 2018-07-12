package Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class BookSpaceScreen extends Tabbar {
    public BookSpaceScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Поиск\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"На карте\"]")
    private MobileElement showOnMapButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Фильтры\"]")
    private MobileElement filterButton;

    @iOSFindBy(className = "XCUIElementTypeCell")
    private List<MobileElement> cells;

    String firstRoom = "//XCUIElementTypeStaticText[@name='%s']";

    String choosedSpace = "//XCUIElementTypeStaticText[@name='%s']";

    public String getChoosedSpace(String space) {return driver.findElementByXPath(String.format(choosedSpace, space)).getText();}



    public MeetingRoomScreen tapToRoomByName(String roomName) {
        driver.findElementByXPath(String.format(firstRoom, roomName)).click();
        return new MeetingRoomScreen(driver);
    }

    public String getFirstRoom(String room) {return driver.findElementByXPath(String.format(firstRoom, room)).getText();}

    public boolean firstRoomIsVisible(String roomName) {
        return driver.findElementByXPath(String.format(firstRoom, roomName)).isDisplayed();
    }

    public MeetingRoomScreen tapToRoom() {
        buttonClick(cells.get(2));
        return new MeetingRoomScreen(driver);
    }

    public MeetingRoomsOnMapScreen tapToMap() {
        buttonClick(showOnMapButton);
        return new MeetingRoomsOnMapScreen(driver);
    }

    public FilterScreen tapToFilterButton() {
        buttonClick(filterButton);
        return new FilterScreen(driver);
    }









}
