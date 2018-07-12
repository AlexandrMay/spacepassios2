package stepDefinations;

import Screens.BookSpaceScreen;
import Screens.FilterScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumberOptions.DriverRunner;

public class filter extends DriverRunner {

    @And("^User is going to filter screen$")
    public void user_is_going_to_filter_screen() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        FilterScreen filterScreen = bookSpaceScreen.tapToFilterButton();
    }

    @Then("^User see that default date is today$")
    public void user_see_that_default_date_is_today() throws Throwable {
        FilterScreen filterScreen = new FilterScreen(driver);
        filterScreen.getCurrentDate(filterScreen.currentDate());
    }

    @And("^Default time is current$")
    public void default_time_is_current() throws Throwable {
        FilterScreen filterScreen = new FilterScreen(driver);
        filterScreen.getCurrentTimeFrom(filterScreen.currentTime());
    }

}
