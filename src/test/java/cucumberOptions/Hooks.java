package cucumberOptions;


import Properties.Caps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.OutputType;

public class Hooks extends Caps {

    private static IOSDriver driver;

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
