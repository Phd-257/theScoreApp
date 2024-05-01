package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void enterCredential(String email, String pass){

        WebElement emailInput = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.fivemobile.thescore:id/email_input_edittext']"));
        emailInput.sendKeys(email);
        WebElement passwordInput = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.fivemobile.thescore:id/password_input_edittext']"));
        passwordInput.sendKeys(pass);

    }

    // Method to click on the login button
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.fivemobile.thescore:id/login_button']"));
        loginButton.click();
    }
}
