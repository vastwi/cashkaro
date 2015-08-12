package factory;

import entities.LoginCredential;

public class LoginCredentials {

    public static LoginCredential getValidCredentials(){
        return new LoginCredential("checkworking1@gmail.com","August12#");
    }
}
