package src.jsmo.model;

public class ConnectionResult {

    private static final String CONNECTION_RESULT_IS_OK = "ok";
    private final boolean isSuccesful;
    private final String message;

    private ConnectionResult(boolean isSuccesful, String message){
        this.isSuccesful = isSuccesful;
        this.message = message;
    }

    public static ConnectionResult Successful() {
        return new ConnectionResult(true, CONNECTION_RESULT_IS_OK);
    }

    public static ConnectionResult Fail(Exception exception) {
        return new ConnectionResult(false, exception.getMessage());
    }

    public boolean isSuccesful(){
        return isSuccesful
    }
}
