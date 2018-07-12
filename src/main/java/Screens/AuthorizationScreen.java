package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AuthorizationScreen extends CommonScreenMethods {
    public AuthorizationScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Пропустить\"]")
    private MobileElement skipButton;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Войти\"]")
    private MobileElement header;

    @iOSFindBy(className = "XCUIElementTypeTextField")
    private MobileElement emailField;

    @iOSFindBy(className = "XCUIElementTypeSecureTextField")
    private MobileElement passwordField;

    @iOSFindBy(accessibility = "icEyeVisibilityOffActive")
    private MobileElement eyeButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Забыли пароль?\"]")
    private MobileElement forgotPasswordButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"ВОЙТИ\"]")
    private MobileElement loginButton;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Войти через соц.сети:\"]")
    private MobileElement staticText;

    @iOSFindBy(accessibility = "Facebook")
    private MobileElement facebookButton;

    @iOSFindBy(accessibility = "Google")
    private MobileElement googleButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Создать аккаунт\"]")
    private MobileElement signUpButton;

    public String headerText = getText(header);

    public RegistrationScreen registerClick() {
        buttonClick(signUpButton);
        return new RegistrationScreen(driver);
    }

    String error = "//XCUIElementTypeStaticText[@name='%s']";

    public String errorTextIs(String errorText) {return driver.findElementByXPath(String.format(error, errorText)).getText();}

    public void typeEmail(String text) {
        typeText(emailField, text);
        driver.hideKeyboard();
    }

    public void typePassword(String text) {
        typeText(passwordField, text);
        driver.hideKeyboard();
    }

    public void cleanFields() {
        cleanField(emailField);
        cleanField(passwordField);
        driver.hideKeyboard();
    }

    public void loginClick() {
        buttonClick(loginButton);
    }

    public void facebookClick() {
        buttonClick(facebookButton);
    }

    public void enteringByFacebook() {
        if(driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Дальше\"]").isDisplayed()) {
            driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Дальше\"]").click(); }
            driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Продолжить\"]").click();
    }






}
