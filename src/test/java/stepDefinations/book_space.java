package stepDefinations;

import Screens.BookSpaceScreen;
import Screens.MeetingRoomScreen;
import Screens.MeetingRoomsOnMapScreen;
import Screens.OnboardingScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;
import org.testng.Assert;


public class book_space extends DriverRunner {


    @Then("^User is on the book_space screen$")
    public void user_is_on_the_bookspace_screen() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        Thread.sleep(7000);
    }

    @And("^\"([^\"]*)\" is pressed$")
    public void something_is_pressed_for_bookspace(String strArg1) throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.buttonClick(strArg1);
    }

    @And("^First tab is active$")
    public void first_tab_is_active() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);

    }

    @When("^User is swipping down the rooms list$")
    public void user_is_swipping_down_the_rooms_list() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        bookSpaceScreen.swipeDown();
    }

    @Then("^\"([^\"]*)\" room in list is invisible$")
    public void something_room_in_list_is_invisible(String strArg1) throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        Assert.assertFalse(bookSpaceScreen.firstRoomIsVisible(strArg1));
    }

    @When("^User is going to meeting room screen$")
    public void user_is_going_to_meeting_room_screen() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        bookSpaceScreen.tapToRoom();
    }

    @Then("^Meeting room screen is visible$")
    public void meeting_room_screen_is_visible() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.tapToBack();
    }

    @When("^User is going to maps screen$")
    public void user_is_going_to_maps_screen() throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        bookSpaceScreen.tapToMap();
    }

    @Then("^Maps screen is visible$")
    public void maps_screen_is_visible() throws Throwable {
        MeetingRoomsOnMapScreen meetingRoomsOnMapScreen = new MeetingRoomsOnMapScreen(driver);
        meetingRoomsOnMapScreen.tapToBack();
    }
}
