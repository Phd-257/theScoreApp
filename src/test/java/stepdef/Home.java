package stepdef;

import io.cucumber.java.en.Then;
import pages.HomePage;
import utils.AppiumDriverSetUp;


public class Home {


    HomePage homePage;

    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        homePage = new HomePage(AppiumDriverSetUp.getDriver());
        homePage.clickDenyLocationPermission();
        homePage.clickMaybeLaterLocationPermission();
        homePage.clickOkayGotItButton();
        homePage.isSearchBarDisplayed();
    }

}
