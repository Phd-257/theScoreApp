package stepdef;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.json.simple.JSONObject;
import utils.AppiumDriverSet;

public class Hooks {

    private static AppiumDriver driver;
    private static final String PLATFORM = System.getProperty("platform", "android"); // Default to Android

    @Before
    public void setUp() {
        JSONObject capabilities = AppiumDriverSet.getDeviceCapabilities(PLATFORM);
        driver = AppiumDriverSet.createDriver(capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
