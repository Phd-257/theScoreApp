package utils;

import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class Common {

    protected final WebDriver driver;

    public Common(WebDriver driver) {
        this.driver = driver;
    }
}
