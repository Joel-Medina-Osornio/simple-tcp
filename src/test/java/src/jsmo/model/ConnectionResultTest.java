package src.jsmo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionResultTest {
    @Test
    void should_get_a_true_value_when_is_sucessful_is_called_on_sucessful_instance() {
        ConnectionResult connectionResult = ConnectionResult.Successful();
        assertTrue(connectionResult.isSuccesful());
    }
}