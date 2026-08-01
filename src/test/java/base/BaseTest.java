package base;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest
{

    protected AndroidDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver = DriverFactory.getDriver();
    }

    @AfterClass
    public void tearDown()
    {
        //End of session and not closing APP
        //DriverFactory.quitDriver();

       //Closing APP and not End of session
        DriverFactory.getDriver().terminateApp("org.wikipedia");
    }

}