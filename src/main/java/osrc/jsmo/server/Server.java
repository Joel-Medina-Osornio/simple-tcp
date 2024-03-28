package osrc.jsmo.server;

import osrc.jsmo.contract.EventsInterceptor;
import osrc.jsmo.contract.Connection;
import osrc.jsmo.model.TCPConfiguration;

import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Connection {
    private final TCPConfiguration tcpConfiguration;

    private EventsInterceptor eventsInterceptor;

    private ServerSocket serverSocket;
    private Socket clientSocket;

    public Server(TCPConfiguration tcpConfiguration) {
        this.tcpConfiguration = tcpConfiguration;
    }

    @Override
    public void Connect() throws Exception {
        serverSocket = new ServerSocket(tcpConfiguration.getPort());
        clientSocket = serverSocket.accept();
        eventsInterceptor = new ServerEventsInterceptor(new ServerMessageDelivery());
    }

    @Override
    public void Disconnect() throws Exception {
        eventsInterceptor.OnDisconnection();
        serverSocket.close();
        clientSocket.close();
    }
}

