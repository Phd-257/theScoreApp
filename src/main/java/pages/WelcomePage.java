package pages;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LoggerUtil;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WelcomePage {

    private final WebDriver driver;

    // Constructor
    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to verify if the welcome text is displayed
    public void isWelcomeTextDisplayed() {
        WebElement welcomeText = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/txt_welcome']"));
        LoggerUtil.info("Welcome text" + welcomeText.getText());
        Assert.assertTrue(welcomeText.getText().equalsIgnoreCase("WELCOME"));
    }

    // Method to click on the "LOG IN" text
    public void clickLoginText() {
        int centerX = (((287 + 793) / 2) + 200);
        int centerY = (1747 + 1800) / 2;

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginElement = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/txt_sign_in']"));
        LoggerUtil.info("Looking for Login Link");
        Assert.assertTrue(loginElement.getText().equalsIgnoreCase("HAVE AN ACCOUNT? LOG IN"));
        // Create a Tap action at the center of the "LOG IN" element
        new TouchAction((PerformsTouchActions) driver)
                .tap(PointOption.point(centerX, centerY))
                .perform();
    }
}
