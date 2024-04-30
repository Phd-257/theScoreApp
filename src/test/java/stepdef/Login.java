package stepdef;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.touch.offset.PointOption;
import pages.LoginPage;
import pages.WelcomePage;
import utils.AppiumDriverSetUp;
import utils.LoggerUtil;

import java.util.concurrent.TimeUnit;

public class Login {

    private AppiumDriver driver = AppiumDriverSetUp.createAndroidDriver();;
    WelcomePage welcomePage;
    LoginPage loginPage;


    @Given("User is on Welcome Page")
    public void userIsOnWelcomePage() {
        LoggerUtil.info("User is on welcome Page");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        welcomePage = new WelcomePage(driver);
        welcomePage.isWelcomeTextDisplayed();
    }

    @And("User click on Login from Welcome Page")
    public void userClickOnLoginFromWelcomePage() {
        LoggerUtil.info("Clicking Login...");
        welcomePage.clickLoginText();
    }

    @Then("Verify user is Login Page")
    public void verifyUserIsLoginPage() {
        LoggerUtil.info("Verifying the title of Login Page..");
        loginPage = new LoginPage(driver);
        loginPage.getLoginPageTitle();

    }

    @And("When User enters email {string} and password {string}")
    public void whenUserEntersEmailAndPassword(String email, String password) {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

//    @Given("User logs in with the {string}")
//    public void userLogsIn(String credential) {
//        // Write code here that turns the phrase above into concrete actions
//        String userName= "";
//        String passWord="";
//        if(credential.equals("harsh")){
//           userName = "patel_harsh@myyahoo.com";
//           passWord = "Harsh@257";
//
//        }
//
//        driver = AppiumDriverSetUp.createAndroidDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//        WebElement welcome = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_welcome\"]"));
//        Assert.assertTrue(welcome.getText().toUpperCase().equals("WELCOME"));
//
//
//        // Perform the click action at the cen"LOG IN" text
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement loginElement = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/txt_sign_in\"]"));
//
//        int centerX = (((287 + 793) / 2)+200);
//        int centerY = (1747 + 1800) / 2;
//
//        // Create a Tap action at the center of the "LOG IN" element
//        new TouchAction((PerformsTouchActions) driver)
//                .tap(PointOption.point(centerX, centerY))
//                .perform();
//
//    }



}
