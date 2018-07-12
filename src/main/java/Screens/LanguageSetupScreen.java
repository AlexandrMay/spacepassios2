package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class LanguageSetupScreen extends CommonScreenMethods {
    public LanguageSetupScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Язык\"]/XCUIElementTypeButton")
    private MobileElement backButton;

    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Язык\"]")
    private MobileElement header;

    @iOSFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Поиск\"]")
    private MobileElement searchField;

    @iOSFindBy(className = "XCUIElementTypeCell")
    private List<MobileElement> languages;

    String selectLanguage = "//XCUIElementTypeStaticText[@name='%s']";

    public String choosenLanguageIs(String language) {
        for (int i = 0; i <= languages.size(); i++) {
            if (languages.get(i).findElementByXPath("//XCUIElementTypeButton[@name=\"Подробнее\"]").isDisplayed()) {
                languages.get(i).findElementByXPath(String.format(selectLanguage, language)).getText();
                break;
            }
        }
            return language;
    }

    String button = "//XCUIElementTypeButton[@name='%s']";


    public void someButtonClick(String someButton) {
        driver.findElementByXPath(String.format(button, someButton)).click();
    }

    public void textTyping(String text) {
        typeText(searchField, text);
    }

    public void checkLanguage() {
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"English\"]").click();
    }

    public void tapToBack() {
        buttonClick(backButton);
    }
















}
