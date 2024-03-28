package osrc.jsmo.server;

import osrc.jsmo.contract.EventsInterceptor;
import osrc.jsmo.contract.MessageDelivery;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEventsInterceptor implements EventsInterceptor {

    private final MessageDelivery messageDelivery;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public ServerEventsInterceptor(MessageDelivery messageDelivery) {
        this.messageDelivery = messageDelivery;
    }

    @Override
    public void OnMessageReceived() {

    }

    @Override
    public void OnMessageSend() {

    }

    @Override
    public void OnConnection() {

    }

    @Override
    public void OnDisconnection() {

    }
}
