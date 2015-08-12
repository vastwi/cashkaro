package common;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProvider {
    public static FirefoxDriver driver;

    public static FirefoxDriver getWebDriver() {
        if (driver == null) {
            System.out.println("Initializing web driver....");
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
