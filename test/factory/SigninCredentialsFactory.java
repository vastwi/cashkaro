package factory;

import entities.SigninCredential;

public class SigninCredentialsFactory {

    public static SigninCredential getValidCredentials(){
        return new SigninCredential("checkworking3@gmail.com","August12#");
    }
}
