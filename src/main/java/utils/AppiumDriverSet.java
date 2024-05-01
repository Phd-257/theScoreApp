package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverSet {

    public static JSONObject getDeviceCapabilities(String platform) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject capabilities = (JSONObject) parser.parse(new FileReader("src/test/resources/deviceCapabilities.json"));
            return (JSONObject) capabilities.get(platform.toLowerCase());
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static AppiumDriver createDriver(JSONObject capabilities) {
        // Initialize Appium driver with the provided capabilities
        AppiumDriver driver = null;

        // Convert JSON object to DesiredCapabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", capabilities.get("platformName"));
        desiredCapabilities.setCapability("deviceName", capabilities.get("deviceName"));
        desiredCapabilities.setCapability("app", capabilities.get("app"));
        desiredCapabilities.setCapability("automationName", capabilities.get("automationName"));
        desiredCapabilities.setCapability("platformVersion", capabilities.get("platformVersion"));

        // Create Appium driver instance using the desired capabilities
        try {
            if (capabilities.get("platformName").equals("android")) {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            } else if (capabilities.get("platformName").equals("iOS")) {
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            } else {
                throw new IllegalArgumentException("Unsupported platform: " + capabilities.get("platformName"));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
