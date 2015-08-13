package frames;

import common.WebDriverProvider;
import entities.LoginCredential;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.HomePage;

import static common.WebDriverFunctions.*;
import static elements.SignInElements.*;

public class SignInFrame {
    private WebDriver driver = WebDriverProvider.getWebDriver();

    public SignInFrame giveValidCredentials(LoginCredential values) {
        WaitForElementPresent(driver, signInIFrame());
        driver.switchTo().frame(driver.findElement(signInIFrame()));
        giveValuesForSignInInputField(values);
        return this;
    }

    private void giveValuesForSignInInputField(LoginCredential values)
    {
        driver.findElement(userName()).sendKeys(values.username);
        driver.findElement(password()).sendKeys(values.password);
    }

    public HomePage submitLogin() {
        driver.findElement(By.id("sign_in")).click();
        return new HomePage();
    }
}
