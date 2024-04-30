package stepdef;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.LongPressOptions;
import utils.AppiumDriverSetUp;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.concurrent.TimeUnit;

public class Login {

    private AppiumDriver driver;

    @Given("User logs in with the {string}")
    public void userLogsIn(String credential) {
        // Write code here that turns the phrase above into concrete actions

        if(credential.equals("harsh")){
            String userName = "patel_harsh@myyahoo.com";
            String password = "Harsh@257";

        }

        driver = AppiumDriverSetUp.createAndroidDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement welcome = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_welcome\"]"));
        Assert.assertTrue(welcome.getText().toUpperCase().equals("WELCOME"));


        // Perform the click action at the cen"LOG IN" text
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginElement = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_sign_in\"]"));

        int centerX = (((287 + 793) / 2)+200);
        int centerY = (1747 + 1800) / 2;

        // Create a Tap action at the center of the "LOG IN" element
        new TouchAction((PerformsTouchActions) driver)
                .tap(PointOption.point(centerX, centerY))
                .perform();

    }

}
