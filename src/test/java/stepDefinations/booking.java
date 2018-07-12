package stepDefinations;

import Screens.AuthorizationScreen;
import Screens.MeetingRoomScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;

public class booking extends DriverRunner {

    @And("^Enter by Facebook$")
    public void enter_by_facebook() throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        authorizationScreen.facebookClick();
        authorizationScreen.enteringByFacebook();
        Thread.sleep(7000);
    }

    @Then("^User press booking button$")
    public void user_press_booking_button() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.pressBooking();
    }

    @And("^Confirm booking and see \"([^\"]*)\" signing, and press to Cancel$")
    public void confirm_booking_and_see_something_signing(String strArg1) throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.confirmBooking();
        meetingRoomScreen.getSiging(strArg1);
        meetingRoomScreen.pressCancel();
    }

    @When("^User is change the date to \"([^\"]*)\" days before today$")
    public void user_is_change_the_date_to_something_days_before_today(int days) throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.tapTooBookData();
        meetingRoomScreen.setAnyDay(days);
        meetingRoomScreen.tapTooBookData();
    }

    @And("^Using My Price Plans for payment$")
    public void using_my_price_plans_for_payment() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.swipeDownAlittle();
        meetingRoomScreen.settingTypeOfPayment(0);
    }

    @And("^Confirm booking$")
    public void confirm_booking() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.pressBooking();
    }

    @And("^Using My Space Pass for payment$")
    public void using_my_space_pass_for_payment() throws Throwable {
        MeetingRoomScreen meetingRoomScreen = new MeetingRoomScreen(driver);
        meetingRoomScreen.swipeDownAlittle();
        meetingRoomScreen.settingTypeOfPayment(1);
    }

}
