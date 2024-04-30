package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LoggerUtil;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click on the "Don't Allow" button for location permission
    public void clickDenyLocationPermission() {
        WebElement denyButton = driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_deny_button']"));
        denyButton.click();
    }

    // Method to click on the "Maybe Later" button for location permission
    public void clickMaybeLaterLocationPermission() {
        try {
            LoggerUtil.info("Clicked on 'Maybe Later' button.");
            // Wait for the "Okay Got It" button to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc='Ok, Got It']")));
            // Click on the "Okay Got It" button
            WebElement okayGotItButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Ok, Got It']"));
            okayGotItButton.click();
            LoggerUtil.info("Clicked on 'Okay Got It' button after 'May be later' button");
        } catch (NoSuchElementException | TimeoutException e) {
            LoggerUtil.info("Okay Got It button is not present after clicking 'May be later' button. Continuing test execution.");
        }

        WebElement maybeLaterButton = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/btn_disallow']"));
        maybeLaterButton.click();
    }

    // Method to click on the "Okay Got It" button
    public void clickOkayGotItButton() {
        try {
            WebElement okayGotItButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Ok, Got It']"));
            okayGotItButton.click();
            LoggerUtil.info("Clicked on 'Okay Got It' button");
        } catch (NoSuchElementException e) {
            LoggerUtil.info("Okay Got It button is not present. Continuing test execution.");
        }

    }

    // Method to verify if the search bar is displayed on the home page
    public boolean isSearchBarDisplayed() {
        WebElement searchBar = driver.findElement(By.id("com.fivemobile.thescore:id/search_bar_text_view"));
        return searchBar.isDisplayed();
    }

}
