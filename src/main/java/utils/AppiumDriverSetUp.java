package utils;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverSetUp {


    public static AppiumDriver createAndroidDriver() {
        AppiumDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set Android device capabilities
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android-14"); // Replace with your device/emulator ID
        capabilities.setCapability("app", "/Users/phd_257/Downloads/theScore.apk"); // Replace with the path to your APK file
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "14");

        // Set Appium server URL
        URL serverUrl = null;
        try {
            serverUrl = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        // Create AndroidDriver instance
        if (serverUrl != null) {
            driver = new AndroidDriver(serverUrl, capabilities);
        }

        return driver;
    }

}
