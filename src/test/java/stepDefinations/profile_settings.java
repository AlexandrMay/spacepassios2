package stepDefinations;

import Screens.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;


public class profile_settings extends DriverRunner {


    @And("^User is on the profile_settings screen$")
    public void user_is_on_the_profilesettings_screen() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        ProfileTabScreen profileTabScreen = bookSpaceScreen.tapToProfileBar();
        profileTabScreen.tapToProfileSettings();
    }

    @When("^User has such default settings$")
    public void user_has_such_default_settings(DataTable table) throws Throwable {
        ProfileSettingsScreen profileSettingsScreen = new ProfileSettingsScreen(driver);
        profileSettingsScreen.getDefaultSettings(table.raw().get(0).get(0));
        profileSettingsScreen.getDefaultSettings(table.raw().get(0).get(1));
    }

    @When("^User is tapping to notices$")
    public void user_is_tapping_to_notices() throws Throwable {
        ProfileSettingsScreen profileSettingsScreen = new ProfileSettingsScreen(driver);
        NoticeScreen noticeScreen = profileSettingsScreen.tapToNotices();
    }

    @Then("^User is on notices screen and see such types$")
    public void user_is_on_notices_screen_and_see_such_types(DataTable table) throws Throwable {
        NoticeScreen noticeScreen = new NoticeScreen(driver);
        noticeScreen.getNoticesType(table.raw().get(0).get(0));
        noticeScreen.getNoticesType(table.raw().get(0).get(1));
        noticeScreen.getNoticesType(table.raw().get(0).get(2));
    }

    @And("^Go back to profile_settings screen from notices_screen$")
    public void go_back_to_profile_settings_screen() throws Throwable {
        NoticeScreen noticeScreen  = new NoticeScreen(driver);
        noticeScreen.tabToBack();
    }



    @Given("^User tap to language$")
    public void user_tap_to_language() throws Throwable {
        ProfileSettingsScreen profileSettingsScreen = new ProfileSettingsScreen(driver);
        profileSettingsScreen.tapToLanguage();
    }

    @When("^User typing \"([^\"]*)\", check it and press \"([^\"]*)\" button$")
    public void user_typing_something_check_it_and_press_something_button(String strArg1, String strArg2) throws Throwable {
        LanguageSetupScreen languageSetupScreen = new LanguageSetupScreen(driver);
        languageSetupScreen.textTyping(strArg1);
        languageSetupScreen.checkLanguage();
        languageSetupScreen.someButtonClick(strArg2);
    }

    @And("^See the default language is \"([^\"]*)\"$")
    public void see_the_default_language_is_something(String strArg1) throws Throwable {
        LanguageSetupScreen languageSetupScreen = new LanguageSetupScreen(driver);
        languageSetupScreen.choosenLanguageIs(strArg1);
    }

    @And("^See that \"([^\"]*)\" is choosen$")
    public void see_that_something_is_choosen(String strArg1) throws Throwable {
        LanguageSetupScreen languageSetupScreen = new LanguageSetupScreen(driver);
        languageSetupScreen.choosenLanguageIs(strArg1);
    }

    @Then("^User is tap to back and press \"([^\"]*)\" button$")
    public void user_is_tap_to_back_and_press_something_button(String strArg1) throws Throwable {
        LanguageSetupScreen languageSetupScreen = new LanguageSetupScreen(driver);
        languageSetupScreen.tapToBack();
        languageSetupScreen.someButtonClick(strArg1);
    }

    @And("^See that choosen language is \"([^\"]*)\"$")
    public void see_that_choosen_language_is_something(String strArg1) throws Throwable {
        ProfileSettingsScreen profileSettingsScreen = new ProfileSettingsScreen(driver);
        profileSettingsScreen.getDefaultSettings(strArg1);
    }

    @When("^User go to My Office and choosing \"([^\"]*)\" space$")
    public void user_go_to_my_office_and_choosing_something_space(String strArg1) throws Throwable {
        ProfileSettingsScreen profileSettingsScreen = new ProfileSettingsScreen(driver);
        profileSettingsScreen.tapToMyOffice();
        profileSettingsScreen.choosingMyOffice(strArg1);
        profileSettingsScreen.backButtonClick();
    }

    @Then("^Space in filter is equals to \"([^\"]*)\"$")
    public void space_in_filter_is_equals_to_choosen(String space) throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        bookSpaceScreen.tapToFilterButton();
        bookSpaceScreen.getChoosedSpace(space);
    }

    @And("^Go back to Book Space screen$")
    public void go_back_to_book_space_screen() throws Throwable {
        ProfileSettingsScreen profileSettingsScreen = new ProfileSettingsScreen(driver);
        BookSpaceScreen bookSpaceScreen = profileSettingsScreen.tapToSearchBar();
    }



}
