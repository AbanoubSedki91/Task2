package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory
{
    private static AndroidDriver driver;
    public static AndroidDriver getDriver()
    {

        if (driver == null)
        {

            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            options.setDeviceName("Xiaomi HyperOS");
            options.setUdid("NBV8GIGQJBX8YLWO");
            options.setAppPackage("org.wikipedia");
            options.setAppActivity("org.wikipedia.main.MainActivity");
            options.setNoReset(true);

            try
            {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }
            catch (MalformedURLException e)
            {
                throw new RuntimeException(e);
            }

        }

        return driver;
    }

    public static void quitDriver()
    {

        if (driver != null)
        {
            driver.quit();
            driver = null;
        }

    }
}