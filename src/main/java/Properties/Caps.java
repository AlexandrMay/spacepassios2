package Properties;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Caps {

    static IOSDriver driver;

    public static IOSDriver capabilities() throws MalformedURLException, FileNotFoundException {

        Properties properties = new Properties();

        FileInputStream fis = new FileInputStream("src/main/java/Properties/env.properties");
        try {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("device_name"));
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("platform_name"));
        cap.setCapability("platformVersion", "11.2.6");
        cap.setCapability("udid", properties.getProperty("ud_id"));
        cap.setCapability(MobileCapabilityType.APP, properties.getProperty("path"));
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
