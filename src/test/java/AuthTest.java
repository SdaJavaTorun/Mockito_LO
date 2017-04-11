import com.sdajava.mocking.AuthenticatorApplication;
import com.sdajava.mocking.AuthenticatorInterface;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by lukas on 11.04.2017.
 */
public class AuthTest {

    @Test
    public void testAuthenticate(){

        //pola do klas
        AuthenticatorApplication authenticatorApplication;
        AuthenticatorInterface authenticatorInterfaceMock;

        String username ="Test123";
        String password = "12345";

        //mokujemy interfejs
        authenticatorInterfaceMock = Mockito.mock(AuthenticatorInterface.class);
        //tworzymy obiekt
        authenticatorApplication = new AuthenticatorApplication(authenticatorInterfaceMock);

        //definiujemy zachowanie
        when(authenticatorInterfaceMock.authenticateUser(username,password))
        .thenReturn(true);

        boolean status = authenticatorApplication.authenticate(username, password);

        assertTrue(status);



    }
}
