package stepDefinations;


import Properties.Caps;
import Screens.AuthorizationScreen;
import Screens.BookSpaceScreen;
import Screens.OnboardingScreen;
import Screens.ProfileTabScreen;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;
import org.testng.Assert;


public class profile_tab extends DriverRunner {


    @When("^App is started and allow to send notifies for profile_tab feature$")
    public void app_is_started_and_allow_to_send_notifies_for_profiletab_feature() throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.alertIsVisibleAndClicked();
    }

    @And("^\"([^\"]*)\" is pressed for profile_tab$")
    public void something_is_pressed_for_profiletab(String strArg1) throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.buttonClick(strArg1);
    }

    @Then("^User is enter credentials and pressed enter button$")
    public void user_is_enter_credentials_and_pressed_enter_button(DataTable data) throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        authorizationScreen.typeEmail(data.raw().get(0).get(0));
        authorizationScreen.typePassword(data.raw().get(0).get(1));
        authorizationScreen.loginClick();
        Thread.sleep(7000);
    }

    @And("^User is on the profile_tab screen$")
    public void user_is_on_the_profiletab_screen() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        bookSpaceScreen.tapToProfileBar();
    }


    @Then("^user with valid creds is in system$")
    public void user_with_valid_creds_is_in_system(DataTable dataTable) throws Throwable {
        ProfileTabScreen profileTabScreen = new ProfileTabScreen(driver);
        Assert.assertEquals(profileTabScreen.getUserName(dataTable.raw().get(0).get(0)), dataTable.raw().get(0).get(0));
        Assert.assertEquals(profileTabScreen.getUserMail(dataTable.raw().get(0).get(1)), dataTable.raw().get(0).get(1));
    }

    @When("^User pressed logout button$")
    public void user_pressed_logout_button() throws Throwable {
        ProfileTabScreen profileTabScreen = new ProfileTabScreen(driver);
        profileTabScreen.logoutClick();
    }

    @Then("^User is on welcome_screen$")
    public void user_is_on_welcomescreen() throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.textIsVisible("Добро пожаловать в SpacePass");
    }

    @And("^He see the alert and confirm logout$")
    public void he_see_the_alert_and_confirm_logout() throws Throwable {
        ProfileTabScreen profileTabScreen = new ProfileTabScreen(driver);
        profileTabScreen.confirmLogout();
    }
}
