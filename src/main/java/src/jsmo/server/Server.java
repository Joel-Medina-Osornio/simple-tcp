package src.jsmo.server;

import src.jsmo.contract.EventsInterceptor;
import src.jsmo.contract.Connection;
import src.jsmo.model.ConnectionResult;
import src.jsmo.model.DisconnectionResult;
import src.jsmo.model.TCPConfiguration;

import java.io.IOException;
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

    public static void main(String[] args) {
        Server server = new Server(null);
        ConnectionResult serverConnectionResult = server.Connect();
        if (serverConnectionResult.isSuccesful()){

        }


    }

    @Override
    public ConnectionResult Connect(){
        try {
            serverSocket = new ServerSocket(tcpConfiguration.getPort());
            clientSocket = serverSocket.accept();
            eventsInterceptor = new ServerEventsInterceptor(new ServerMessageDelivery());
        } catch (IOException ioException) {
            return ConnectionResult.Fail(ioException);
        }

        return ConnectionResult.Successful();
    }

    @Override
    public DisconnectionResult Disconnect() {
        try {
            eventsInterceptor.OnDisconnection();
            serverSocket.close();
            clientSocket.close();
        } catch (IOException e) {
            return null;
        }

        return null;
    }
}

