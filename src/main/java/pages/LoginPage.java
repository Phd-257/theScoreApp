package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LoggerUtil;

public class LoginPage {

    private final WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to get the title of the login page
    public void getLoginPageTitle() {
        WebElement titleElement = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.fivemobile.thescore:id/titleTextView']"));
        Assert.assertTrue(titleElement.getText().equalsIgnoreCase("Log In"));
    }

    // Method to enter email
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.fivemobile.thescore:id/email_input_edittext']"));
        LoggerUtil.info("Entering Email");
        emailInput.sendKeys(email);
    }

    // Method to enter password
    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.fivemobile.thescore:id/password_input_edittext']"));
        LoggerUtil.info("Entering Password");
        passwordInput.sendKeys(password);
    }

    // Method to click on the login button
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.fivemobile.thescore:id/login_button']"));
        LoggerUtil.info("Clicking Log In");
        loginButton.click();
    }
}
