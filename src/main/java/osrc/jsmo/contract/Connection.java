package osrc.jsmo.contract;

public interface Connection {
    void Connect() throws Exception;
    void Disconnect() throws Exception;
}
