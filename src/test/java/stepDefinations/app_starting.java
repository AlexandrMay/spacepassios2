package stepDefinations;

import Screens.OnboardingScreen;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;
import org.openqa.selenium.OutputType;


public class app_starting extends DriverRunner {


    @When("^App is started and allow to send notifies$")
    public void app_is_started_and_allow_to_send_notifies() throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
        onboardingScreen.alertIsVisibleAndClicked();
    }

    @Then("^Screen is visible with (.+)$")
    public void screen_is_visible_with(String text) throws Throwable {
        OnboardingScreen onboardingScreen = new OnboardingScreen(driver);
            onboardingScreen.textIsVisible(text);
            onboardingScreen.swipeLeft();
    }

    @And("^Driver is off$")
    public void driver_is_off() throws Throwable {
        driver.quit();
    }

    @After
    public void screenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = driver
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
