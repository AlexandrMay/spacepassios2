package Screens;

import Properties.CommonScreenMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class RegistrationScreen extends CommonScreenMethods {
    public RegistrationScreen(IOSDriver driver) {
        super(driver);
    }

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Пропустить\"]")
    private MobileElement skipButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Регистрация\"]")
    private MobileElement header;

    @iOSFindBy(className = "XCUIElementTypeTextField")
    private MobileElement emailField;

    @iOSFindBy(className = "XCUIElementTypeSecureTextField")
    private MobileElement passwordField;

    @iOSFindBy(accessibility = "icEyeVisibilityOffActive")
    private MobileElement eyeButton;

    @iOSFindBy(accessibility = "checkboxOff")
    private MobileElement checkBox;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Я прочитал и согласен с Пользовательским Соглашением, Политикой Безопасности и Условиями Оплаты Услуг и Отказа от Услуг \"]")
    private MobileElement termsLink;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"ЗАРЕГИСТРИРОВАТЬСЯ\"]")
    private MobileElement registrationButton;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Вы можете зарегистрироваться через соц.сети:\"]")
    private MobileElement staticText;

    @iOSFindBy(accessibility = "Facebook")
    private MobileElement faceBookButton;

    @iOSFindBy(accessibility = "Google")
    private MobileElement googleButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"У меня уже есть аккаунт\"]")
    private MobileElement accountButton;

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

    public void registerButtonClick() {
        buttonClick(registrationButton);
    }

    public void eyeButtonClick() {
        buttonClick(eyeButton);
    }

    public PolicyScreen termsClick() {
        buttonClick(termsLink);
        return new PolicyScreen(driver);
    }

    public AuthorizationScreen accountClick() {
        buttonClick(accountButton);
        return new AuthorizationScreen(driver);
    }

    String error = "//XCUIElementTypeStaticText[@name='%s']";

    String enteredPassword = "//XCUIElementTypeTextField[@value='%s']";

    public String errorTextIs(String errorText) {return driver.findElementByXPath(String.format(error, errorText)).getText();}

    public String passwordTextIs(String passwordText) {return driver.findElementByXPath(String.format(enteredPassword, passwordText)).getText();}

}
