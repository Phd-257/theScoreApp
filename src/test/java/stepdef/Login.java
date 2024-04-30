package stepdef;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import pages.WelcomePage;
import utils.AppiumDriverSetUp;
import utils.LoggerUtil;

import java.util.concurrent.TimeUnit;

public class Login {

    AppiumDriver driver = AppiumDriverSetUp.createAndroidDriver();

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
        LoggerUtil.info("Entering Email..");
        loginPage.enterEmail(email);
        LoggerUtil.info("Entering Password ....");
        loginPage.enterPassword(password);
        LoggerUtil.info("Click on Login Button");
        loginPage.clickLoginButton();
    }

}
