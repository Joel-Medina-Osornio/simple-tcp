package src.jsmo.model;

import lombok.Getter;

public class ConnectionResult {

    private static final String CONNECTION_RESULT_IS_OK = "ok";
    private final boolean IS_SUCCESSFUL;

    @Getter
    private final String message;

    private ConnectionResult(boolean isSuccessful, String message){
        this.IS_SUCCESSFUL = isSuccessful;
        this.message = message;
    }

    public static ConnectionResult Successful() {
        return new ConnectionResult(true, CONNECTION_RESULT_IS_OK);
    }

    public static ConnectionResult Fail(Exception exception) {
        return new ConnectionResult(false, exception.getMessage());
    }

    public boolean connectionStatus(){
        return IS_SUCCESSFUL;
    }
}
