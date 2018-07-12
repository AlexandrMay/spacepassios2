package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;



public class FilterScreen extends CommonScreenMethods {
    public FilterScreen(IOSDriver driver) {
        super(driver);
    }


  //  String headerText = "//XCUIElementTypeOther[@name='%s']";

    //String xpathHeader = String.format(headerText, properties.getProperty("filter_screen_header"));

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Фильтры\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Отменить\"]")
    private MobileElement cancel;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Сбросить\"]")
    private MobileElement reset;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ДАТА И ВРЕМЯ БРОНИРОВАНИЯ\"]")
    private MobileElement firstHeading;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Дата\"]")
    private MobileElement date;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Ищу на точное время\"]")
    private MobileElement correctTime;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"С\"]")
    private MobileElement from;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"До\"]")
    private MobileElement to;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ПАРАМЕТРЫ ПЕРЕГОВОРНЫХ КОМНАТ\"]")
    private MobileElement secondHeading;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Вместимость\"]")
    private MobileElement peopleQty;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Услуги\"]")
    private MobileElement services;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Доступно по SPACEPASS\"]")
    private MobileElement avaliableBySpacePass;

    @iOSFindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Доступно по SPACEPASS\"]")
    private MobileElement avaliableBySpacePassSwitcher;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"МЕСТОПОЛОЖЕНИЕ\"]")
    private MobileElement locationHeading;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Город\"]")
    private MobileElement city;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Пространства\"]")
    private MobileElement spaces;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Применить\"]")
    private MobileElement apply;


    String currentDate = "//XCUIElementTypeStaticText[@name='%s']";

    String currentTimeFrom = "//XCUIElementTypeStaticText[@name='%s']";

    public String getCurrentTimeFrom(String time) {return driver.findElementByXPath(String.format(currentTimeFrom, time)).getText();}

    public String getCurrentDate(String date) {return driver.findElementByXPath(String.format(currentDate, date)).getText();}



}
