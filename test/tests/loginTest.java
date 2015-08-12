package tests;

import factory.LoginCredentials;
import org.junit.Test;
import page.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginWithValidInputs()
    {
        new HomePage()
                .clickOnSignIn()
                .giveValidCredentials(LoginCredentials.getValidCredentials())
                .submitLogin()
                .checkIfUserIsInLoggedInHomePage();
    }

}
