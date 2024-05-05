package src.jsmo.model;

import lombok.Getter;

public class DisconnectionResult {
    private static final String DISCONNECTION_OK = "ok";

    private final boolean IS_DISCONNECTED;

    private String message;

    private DisconnectionResult(boolean isDisconnected, String message){
        this.IS_DISCONNECTED = isDisconnected;
        this.message = message;
    }
    public static DisconnectionResult successful(){
        return new DisconnectionResult(true, DISCONNECTION_OK);
    }
    public static DisconnectionResult fail(Exception e){
        return new DisconnectionResult(false, e.getMessage());
    }

    public boolean getStatus(){
        return this.IS_DISCONNECTED;
    }
    public String getMessage(){
        return this.message;
    }
}
