package Properties;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class CommonScreenMethods {


    protected Properties properties = new Properties();

    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("src/main/java/Properties/russian.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public CommonScreenMethods(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    protected IOSDriver driver;


    public String getText(MobileElement element) {
        return element.getText();
    }

    public void buttonClick(MobileElement element) {
        element.click();
    }

    public void typeText(MobileElement element, String text) {
        element.sendKeys(text);
    }

    public void cleanField(MobileElement element) {element.clear();}

    public boolean isElementPresent(String xpath) {
        try {
            driver.findElementByXPath(xpath);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isElementInPluralIsPresent(String classname, int index) {
        try {
            driver.findElementsByClassName(classname).get(index);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void alertVisibility(String xpath) {
        boolean i = isElementPresent(xpath);
        if (i == true) {
            driver.findElementByXPath(xpath).click();
        }
    }

    public void swipeDown() throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth()/2;
        int y1 = (int)(size.getHeight()*0.60);
        int y2 = (int)(size.getHeight()*0.10);
        driver.swipe(x, y1,x, y2, 750);
        Thread.sleep(1000);
    }

    public String currentDate() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy");
        return format.format(date);
    }

    public String currentTime() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        return format.format(date);
    }

    public String someDate(String pattern, int amount) {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DAY_OF_MONTH, amount);
        Date newDate = instance.getTime();
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(newDate);
    }

    public void swipeUp() throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth()/2;
        int y1 = (int)(size.getHeight()*0.50);
        int y2 = (int)(size.getHeight()*0.70);
        driver.swipe(x, y1,x, y2, 750);
        Thread.sleep(1000);
    }

    public void swipeLeft() throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int y =  (int) (size.getHeight()*0.50);
        int x1 = (int)(size.getWidth()*0.90);
        int x2 = (int)(size.getWidth()*0.10);
        driver.swipe(x1, y,x2, y, 1000);
        Thread.sleep(1000);
    }

}