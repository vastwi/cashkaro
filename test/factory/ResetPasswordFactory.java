package factory;

import entities.ResetPassword;

public class ResetPasswordFactory {

    public static ResetPassword getValidEmailAddress(){
        return new ResetPassword("checkworking1@gmail.com");
    }
}
