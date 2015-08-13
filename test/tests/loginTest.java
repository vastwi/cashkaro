package tests;

import factory.LoginCredentialsFactory;
import org.junit.Test;
import page.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginWithValidInputs()
    {
        new HomePage()
                .clickOnSignIn()
                .giveValidCredentials(LoginCredentialsFactory.getValidCredentials())
                .submitLogin()
                .checkIfUserIsInLoggedInHomePage();
    }

}
