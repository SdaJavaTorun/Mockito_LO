package com.sdajava.mocking;

/**
 * Created by lukas on 10.04.2017.
 */
public class AuthenticatorApplication {
    private AuthenticatorInterface authenticator;
    public AuthenticatorApplication(AuthenticatorInterface authenticator) {
        this.authenticator = authenticator;
    }

    public boolean authenticate(String username, String password) {
        boolean authenticated;
        authenticated = this.authenticator.authenticateUser(username, password);
        return authenticated;
    }


}
