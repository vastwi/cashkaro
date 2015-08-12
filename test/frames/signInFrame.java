package frames;

import common.WebDriverProvider;
import entities.LoginCredential;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.HomePage;

import static common.WebDriverFunctions.WaitForElementPresent;

public class SignInFrame {
    private WebDriver driver = WebDriverProvider.getWebDriver();

    private By signInIFrameElement()
    {
        return By.cssSelector("iframe.cboxIframe");
    }

    public SignInFrame giveValidCredentials(LoginCredential values) {
        WaitForElementPresent(driver, signInIFrameElement());
        driver.switchTo().frame(driver.findElement(signInIFrameElement()));
        giveValuesForSignInInputField(values);
        return this;
    }

    private void giveValuesForSignInInputField(LoginCredential values)
    {
        driver.findElement(By.id("uname")).sendKeys(values.username);
        driver.findElement(By.id("pwd-txt")).sendKeys(values.password);
    }

    public HomePage submitLogin() {
        driver.findElement(By.id("sign_in")).click();
        return new HomePage();
    }
}
