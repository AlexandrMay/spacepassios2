package stepDefinations;

import Screens.AboutSpacePassScreen;
import Screens.ProfileSettingsScreen;
import Screens.ProfileSupportScreen;
import Screens.ProfileTabScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;

public class profile_support_about extends DriverRunner {

    @When("^User is tap to about$")
    public void user_is_tap_to_about() throws Throwable {
        ProfileTabScreen profileTabScreen = new ProfileTabScreen(driver);
        AboutSpacePassScreen aboutSpacePassScreen = profileTabScreen.tapToAbout();
    }

    @Then("^User is on the about screen$")
    public void user_is_on_the_about_screen() throws Throwable {
        AboutSpacePassScreen aboutSpacePassScreen = new AboutSpacePassScreen(driver);
    }

    @And("^User is tap to back from about screen$")
    public void user_is_tap_to_back_from_about_screen() throws Throwable {
        AboutSpacePassScreen aboutSpacePassScreen = new AboutSpacePassScreen(driver);
        ProfileTabScreen profileTabScreen = aboutSpacePassScreen.tapToBack();
    }

    @When("^User is tap to support$")
    public void user_is_tap_to_support() throws Throwable {
        ProfileTabScreen profileTabScreen = new ProfileTabScreen(driver);
        ProfileSupportScreen profileSupportScreen = profileTabScreen.tapToSupport();
    }

    @Then("^User is on the support screen$")
    public void user_is_on_the_support_screen() throws Throwable {
        ProfileSupportScreen profileSupportScreen = new ProfileSupportScreen(driver);
    }

    @And("^User is tap to back from support screen$")
    public void user_is_tap_to_back_from_support_screen() throws Throwable {
        ProfileSupportScreen profileSupportScreen = new ProfileSupportScreen(driver);
        ProfileTabScreen profileTabScreen = profileSupportScreen.tapToBack();
    }






}
