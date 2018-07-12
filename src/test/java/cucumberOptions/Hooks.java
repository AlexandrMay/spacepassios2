package cucumberOptions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;

public class Hooks extends DriverRunner {

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
