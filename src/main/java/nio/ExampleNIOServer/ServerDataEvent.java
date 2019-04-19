package nio.ExampleNIOServer;

import java.nio.channels.SocketChannel;

public class ServerDataEvent {
    ExampleNIOServer server;
    public SocketChannel socket;
    public byte[] data;

    public ServerDataEvent(ExampleNIOServer server, SocketChannel socket, byte[] data) {
        this.server = server;
        this.socket = socket;
        this.data = data;
    }
}
