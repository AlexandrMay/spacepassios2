package cucumberOptions;

import Properties.Caps;
import io.appium.java_client.ios.IOSDriver;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class DriverRunner extends Caps {

    public static IOSDriver driver;

    static {
        try {
            driver = capabilities();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
