package osrc.jsmo.contract;

public interface EventsInterceptor {
    void OnMessageReceived();
    void OnMessageSend();
    void OnConnection();
    void OnDisconnection();
}
