package stepDefinations;

import Properties.Caps;
import Screens.AuthorizationScreen;
import Screens.OnboardingScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;



public class user_authorization extends DriverRunner {

    @Then("^User is on the user_authorization screen$")
    public void user_is_on_the_userauthorization_screen() throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);

    }

    @And("^\"([^\"]*)\" is pressed here$")
    public void something_is_pressed_here(String strArg1) throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.buttonClick(strArg1);
    }

    @When("^user is entered (.+) and (.+)$")
    public void user_is_entered_and(String email, String password) throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        authorizationScreen.typeEmail(email);
        authorizationScreen.typePassword(password);
        authorizationScreen.loginClick();
    }

    @Then("^Error is (.+)$")
    public void error_is(String error) throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        authorizationScreen.errorTextIs(error);
    }

    @And("^Fields are cleaned then$")
    public void fields_are_cleaned_then() throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        authorizationScreen.cleanFields();
    }

    @And("^Driver is off for user_authorization$")
    public void driver_is_off_for_userauthorization() throws Throwable {
        driver.quit();
    }
}
