package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class League {
    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        Assert.assertTrue(true);
    }

    @And("User clicks Leagues from bottom navigation")
    public void userClicksLeaguesFromBottomNavigation() {
        Assert.assertTrue(true);
    }

    @And("User clicks on {string}")
    public void userClicksOn(String arg0) {
        Assert.assertTrue(true);
    }

    @Then("User verify user is on {string} page")
    public void userVerifyUserIsOnPage(String arg0) {
        Assert.assertTrue(true);
    }

    @And("user click on Standings of the game")
    public void userClickOnStandingsOfTheGame() {
        Assert.assertTrue(true);
    }

    @Then("Verify user is on Standing sub-tab")
    public void verifyUserIsOnStandingSubTab() {
        Assert.assertTrue(true);
    }

    @And("user click on back Button")
    public void userClickOnBackButton() {
        Assert.assertTrue(true);
    }

    @Then("verify user is on League Page")
    public void verifyUserIsOnLeaguePage() {
        Assert.assertTrue(true);
    }

    @Then("verify user is on the League page")
    public void verifyUserIsOnTheLeaguePage() {
        Assert.assertTrue(true);

    }
}
