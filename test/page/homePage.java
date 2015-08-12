package page;

import common.WebDriverProvider;
import frames.SignInFrame;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static common.WebDriverFunctions.WaitForElementPresent;

public class HomePage {
    private WebDriver driver = WebDriverProvider.getWebDriver();

    public SignInFrame clickOnSignIn() {
        driver.findElement(By.cssSelector("a.fl.signin_popupbox")).click();
        return new SignInFrame();
    }

    public void checkIfUserIsInLoggedInHomePage() {
        WaitForElementPresent(driver, By.cssSelector("li.fl.pos.my_drop a"));
        Assert.assertEquals(driver.findElement(By.cssSelector("li.fl.pos.my_drop a")).getText(),"MY ACCOUNT");
    }
}
