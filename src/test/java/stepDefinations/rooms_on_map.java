package stepDefinations;

import Screens.MeetingRoomsOnMapScreen;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;


public class rooms_on_map extends DriverRunner {


    @Then("^User is on the rooms_on_map screen$")
    public void user_is_on_the_roomsonmap_screen() throws Throwable {
        MeetingRoomsOnMapScreen meetingRoomsOnMapScreen = new MeetingRoomsOnMapScreen(driver);
    }

    @When("^User is swipping card$")
    public void user_is_swipping_card() throws Throwable {
        MeetingRoomsOnMapScreen meetingRoomsOnMapScreen = new MeetingRoomsOnMapScreen(driver);
        meetingRoomsOnMapScreen.swipeCardToLeft();
    }

    @Then("^He see that space is \"([^\"]*)\" in card$")
    public void he_see_that_space_is_something_in_card_and_map(String strArg1) throws Throwable {
        MeetingRoomsOnMapScreen meetingRoomsOnMapScreen = new MeetingRoomsOnMapScreen(driver);

    }










}
