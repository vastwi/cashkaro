package frames;

import common.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static common.WebDriverFunctions.WaitForElementPresent;
import static elements.ResetPasswordElements.*;

public class ResetPasswordFrame {
    private WebDriver driver = WebDriverProvider.getWebDriver();

    public ResetPasswordFrame giveUserName() {
        WaitForElementPresent(driver, resetEmailAddress());
        driver.findElement(resetEmailAddress()).sendKeys("checkworking1@gmail.com");
        return this;
    }

    public ResetPasswordFrame submitResetPassword() {
        driver.findElement(submitButton()).click();
        return this;
    }

    public ResetPasswordFrame checkIfMessageForResetAppears() {
        WaitForElementPresent(driver, passwordSentFrame());
        Assert.assertEquals(driver.findElement(passwordSentFrame()).getText(), "Password sent!");
        return this;
    }
}
