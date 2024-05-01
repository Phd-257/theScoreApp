package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LeaguePage;
import utils.LoggerUtil;

public class League {

    LeaguePage leaguePage = new LeaguePage(Hooks.getDriver());
    @And("User clicks on League")
    public void userClicksOnLeague() {
        LoggerUtil.info("click on League Button");
        leaguePage.clickOnLeagueButton();
    }

    @Then("Verify User is on League Page")
    public void verifyUserIsOnLeaguePage() {

        LoggerUtil.info("Verifying League page");
        leaguePage.isOnLeaguePage();
    }

    @And("User clicks on MLB")
    public void userClicksOnNHL() {
        LoggerUtil.info("click on MLB");
        leaguePage.clickNBLButton();
    }


    @Then("User verifies User is on MLB Page")
    public void userVerifiesUserIsOnNHLPage() {

        LoggerUtil.info("Verifying MLB header");
        leaguePage.isOnNHLPage();
    }

    @And("User clicks on Standing on MLB Page")
    public void userClicksOnOnNHLPage() {

        LoggerUtil.info("click on standings");
        leaguePage.clickStandingButton();
    }

    @Then("Verify user is on Standing Page")
    public void verifyUserIsOnStandingPage() {
        LoggerUtil.info("verifying standing button");
        leaguePage.isOnStandingPage();
    }

    @And("User clicks on Back Button")
    public void userClicksOnBackButton() {

        LoggerUtil.info("click on back button");
        leaguePage.clickBackButton();
    }

}
