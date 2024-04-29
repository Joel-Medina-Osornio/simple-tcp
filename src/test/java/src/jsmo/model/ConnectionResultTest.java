package src.jsmo.model;

import org.junit.jupiter.api.Test;

import java.net.ConnectException;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionResultTest {
    @Test
    void should_get_a_true_value_when_is_successful_is_called_on_successful_instance() {
        ConnectionResult connectionResult = ConnectionResult.Successful();
        assertTrue(connectionResult.isIS_SUCCESSFUL());
    }
    @Test
    void isSuccessful_should_return_false_when_the_fail_method_is_called(){
        ConnectionResult connectionResult = ConnectionResult.Fail(new ConnectException());
        assertFalse(connectionResult.isIS_SUCCESSFUL());
    }
}