package stepdef;

import io.cucumber.java.en.Then;
import pages.HomePage;


public class Home {


    HomePage homePage;

    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        homePage = new HomePage(Hooks.getDriver());
        homePage.clickDenyLocationPermission();
        homePage.clickMaybeLaterLocationPermission();
        homePage.clickOkayGotItButton();
        homePage.isSearchBarDisplayed();
    }

}
