package stepDefinations;

import Screens.BookSpaceScreen;
import Screens.MyBookingsScreen;
import cucumber.api.java.en.Then;
import cucumberOptions.DriverRunner;

public class my_bookings extends DriverRunner {

    @Then("^User is going to MyBookings tab$")
    public void user_is_going_to_mybookings_tab() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        MyBookingsScreen myBookingsScreen = bookSpaceScreen.tapToMyBookingsBar();
    }

}
