package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LoggerUtil;

public class LeaguePage {

    private final WebDriver driver;

    public LeaguePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnLeagueButton(){

        WebElement leagueButton = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Leagues']"));
        leagueButton.click();
    }
    // Method to verify if the user is on the League page
    public void isOnLeaguePage() {

        try {
            WebElement cancelButton = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.fivemobile.thescore:id/dismiss_modal']"));
            cancelButton.click();
            LoggerUtil.info("Clicked on 'Cancel' button");
        } catch (NoSuchElementException e) {
            LoggerUtil.info("Cancel button is not present. Continuing test execution.");
        }

        WebElement leagueTitle= driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/titleTextView']"));
        Assert.assertTrue(leagueTitle.getText().equalsIgnoreCase("Leagues"));
    }

    // Method to click on the "NHL" button
    public void clickNBLButton() {

        WebElement nhlButton = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/league_name_text' and @text='MLB']"));
        nhlButton.click();
    }

    // Method to verify if the user is on the NHL page
    public void isOnNHLPage() {
        WebElement nhlHeader = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/titleTextView']"));
        Assert.assertTrue(nhlHeader.getText().equalsIgnoreCase("MLB"));
    }

    // Method to click on the "Standing" button on the NHL page
    public void clickStandingButton() {
        WebElement standingButton = driver.findElement(By.xpath("//android.widget.TextView[@text='STANDINGS']"));
        standingButton.click();
    }

    // Method to verify if the user is on the Standing page by checking standing button is not clickable
    public void isOnStandingPage() {

        WebElement standingButton = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Standings']"));
        Assert.assertTrue(standingButton.isEnabled());
    }

    // Method to click on the "Back" button
    public void clickBackButton() {
        WebElement standingButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));
        standingButton.click();
    }


}
