package stepDefinations;

import Screens.BookSpaceScreen;
import Screens.MeetingRoomScreen;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;
import org.testng.Assert;

public class meeting_room extends DriverRunner {

    private static String roomName;

    @And("^User see \"([^\"]*)\" room$")
    public void user_see_something_room(String strArg1) throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        roomName = bookSpaceScreen.getFirstRoom(strArg1);
    }

    @And("^User goes to \"([^\"]*)\" room$")
    public void user_goes_to_something_room(String strArg1) throws Throwable {
        BookSpaceScreen bookSpaceScreen = new BookSpaceScreen(driver);
        MeetingRoomScreen meetingRoomScreen = bookSpaceScreen.tapToRoomByName(strArg1);
    }

    @And("^User see that the name of header is also \"([^\"]*)\"$")
    public void user_see_that_names_are_the_same(String headerName) throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        String header = meetingRoomScreen.getHeaderName(headerName);
        Assert.assertEquals(roomName, header);
    }

    @Given("^User see that booking date is equals to current date$")
    public void user_see_that_booking_date_is_equals_to_current_date() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        System.out.println(meetingRoomScreen.currentDate());
        meetingRoomScreen.getBookDate(meetingRoomScreen.currentDate());
    }

    @When("^User typing to plus twice and to minus once$")
    public void user_typing_to_plus_twice_and_to_minus_once() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.tapToPlus();
        meetingRoomScreen.tapToPlus();
        meetingRoomScreen.tapToMinus();
    }

    @Then("^he see that time interval is \"([^\"]*)\"$")
    public void he_see_that_time_interval_is_something(String strArg1) throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.getTimeInterval(strArg1);
    }

    @And("^He change the data to tomorrow$")
    public void he_change_the_data_to_tomorrow() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.tapTooBookData();
        meetingRoomScreen.setAnyDay(1);
        meetingRoomScreen.tapTooBookData();
    }

    @And("^User set time by pickers$")
    public void user_set_time_by_pickers(DataTable table) throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.swipeDownAlittle();
        meetingRoomScreen.tapToBegin();
        meetingRoomScreen.setHours(table.raw().get(0).get(0));
        meetingRoomScreen.setMinutes(table.raw().get(0).get(2));
        meetingRoomScreen.tapToBegin();
        meetingRoomScreen.tapToEnd();
        meetingRoomScreen.setHours(table.raw().get(0).get(1));
        meetingRoomScreen.setMinutes(table.raw().get(0).get(2));
        meetingRoomScreen.tapToEnd();
    }

    @And("^he see that time interval is changed to \"([^\"]*)\"$")
    public void he_see_that_time_interval_is_changed_to_something(String strArg1) throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.getTimeInterval(strArg1);
    }
}
