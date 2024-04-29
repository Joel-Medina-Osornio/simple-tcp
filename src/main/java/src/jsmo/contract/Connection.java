package src.jsmo.contract;

import src.jsmo.model.ConnectionResult;
import src.jsmo.model.DisconnectionResult;

public interface Connection {
    ConnectionResult Connect();
    DisconnectionResult Disconnect() throws Exception;
}
