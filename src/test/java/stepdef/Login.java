package stepdef;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.json.simple.JSONObject;
import pages.LoginPage;
import pages.WelcomePage;
import utils.JasonReader;
import utils.LoggerUtil;

import java.util.Objects;

public class Login {

    AppiumDriver driver = Hooks.getDriver();

    WelcomePage welcomePage;
    LoginPage loginPage;


    @Given("User is on Welcome Page")
    public void userIsOnWelcomePage() {
        LoggerUtil.info("User is on welcome Page");
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

    @And("When user Enters {string}")
    public void whenUserEnters(String credential) {

        JSONObject testData = JasonReader.getTestData(credential);
        String email = (String) Objects.requireNonNull(testData).get("email");
        String password = (String) testData.get("password");
        LoggerUtil.info("Entering Email and pass..");
        loginPage.enterCredential(email,password);
        LoggerUtil.info("Click on Login Button");
        loginPage.clickLoginButton();

    }

}
