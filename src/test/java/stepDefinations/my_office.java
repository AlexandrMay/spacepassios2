package stepDefinations;

import Screens.BookSpaceScreen;
import Screens.MyOfficeScreen;
import cucumber.api.java.en.Then;
import cucumberOptions.DriverRunner;

public class my_office extends DriverRunner {

    @Then("^User is going to MyOffice tab$")
    public void user_is_going_to_myoffice_tab() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        MyOfficeScreen myOfficeScreen = bookSpaceScreen.tapToMyOfficeBar();
    }

}
