package stepDefinations;

import Screens.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;
import org.testng.Assert;

public class profile_data extends DriverRunner {


    @When("^App is started and allow to send notifies for profile_data feature$")
    public void app_is_started_and_allow_to_send_notifies_for_profiledata_feature() throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.alertIsVisibleAndClicked();
    }

    @Then("^User is enter credentials and pressed enter button for profile_data$")
    public void user_is_enter_credentials_and_pressed_enter_button_for_profiledata(DataTable data) throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        authorizationScreen.typeEmail(data.raw().get(0).get(0));
        authorizationScreen.typePassword(data.raw().get(0).get(1));
        authorizationScreen.loginClick();
        Thread.sleep(4000);
    }

    @And("^\"([^\"]*)\" is pressed for profile_data$")
    public void something_is_pressed_for_profiledata(String strArg1) throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.buttonClick(strArg1);
    }

    @And("^User is on the profile_data screen$")
    public void user_is_on_the_profiledata_screen() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        ProfileTabScreen profileTabScreen = bookSpaceScreen.tapToProfileBar();
        profileTabScreen.tapToProfile();
    }

    @When("^User is tapping on camera with (.+)$")
    public void user_is_tapping_on_camera_with(int index) throws Throwable {
        ProfileScreen profileScreen = new ProfileScreen(driver);
        profileScreen.tapToCamera(index);
    }

    @Then("^User see such buttons as (.+), (.+) and (.+)$")
    public void user_see_such_buttons_as_and(String buttonname1, String buttonname2, String buttonname3) throws Throwable {
        ProfileScreen profileScreen = new ProfileScreen(driver);
        Assert.assertEquals(profileScreen.getButtonName(buttonname1), buttonname1);
        Assert.assertEquals(profileScreen.getButtonName(buttonname2), buttonname2);
        Assert.assertEquals(profileScreen.getButtonName(buttonname3), buttonname3);
        profileScreen.closeAlert();
    }

    @Then("^User has such data as$")
    public void user_has_such_data_as(DataTable table) throws Throwable {
        ProfileScreen profileScreen = new ProfileScreen(driver);
        Assert.assertEquals(profileScreen.getUserData(table.raw().get(0).get(0)), table.raw().get(0).get(0));
        Assert.assertEquals(profileScreen.userNameText, table.raw().get(0).get(1));
        Assert.assertEquals(profileScreen.getUserData(table.raw().get(1).get(0)), table.raw().get(1).get(0));
        Assert.assertEquals(profileScreen.userSurnameText, table.raw().get(1).get(1));
    }

}
