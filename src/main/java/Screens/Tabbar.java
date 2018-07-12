package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Tabbar extends CommonScreenMethods {
    public Tabbar(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Поиск\"]")
    private MobileElement searchBar;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Мой Офис\"]")
    private MobileElement myOfficeBar;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Бронирования\"]")
    private MobileElement myBookingsBar;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Профиль\"]")
    private MobileElement myProfileBar;


    public ProfileTabScreen tapToProfileBar() {
        buttonClick(myProfileBar);
        return new ProfileTabScreen(driver);
    }

    public BookSpaceScreen tapToSearchBar() {
        buttonClick(searchBar);
        return new BookSpaceScreen(driver);
    }

    public MyOfficeScreen tapToMyOfficeBar() {
        buttonClick(myOfficeBar);
        return new MyOfficeScreen(driver);
    }

    public MyBookingsScreen tapToMyBookingsBar() {
        buttonClick(myOfficeBar);
        return new MyBookingsScreen(driver);
    }
















}
