package tests;

import factory.SigninCredentialsFactory;
import org.junit.Test;
import page.HomePage;

public class SigninTest extends BaseTest {

    @Test
    public void verifySigninWithValidInputs()
    {
        new HomePage()
                .clickOnSignIn()
                .giveValidCredentials(SigninCredentialsFactory.getValidCredentials())
                .submitSignin()
                .checkIfUserIsInLoggedInHomePage();
    }

    @Test
    public void verifyresetPassword()
    {
        new HomePage()
                .clickOnSignIn()
                .clickOnResetPassword()
                .giveUserName()
                .submitResetPassword()
                .checkIfMessageForResetAppears();
    }

}
