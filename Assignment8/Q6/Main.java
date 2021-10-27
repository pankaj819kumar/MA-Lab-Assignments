package Q6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class Main {
   
    public static void main(String[] args) throws IOException {
        var socket = new DatagramSocket();
        var packet = new DatagramPacket("hello".getBytes(), 5, InetAddress.getByName("ping.online.net"), 5206);

        System.out.println("packet.getAddress() returns: " + packet.getAddress());
        System.out.println("packet.getData() returns: " + Arrays.toString(packet.getData()));
        System.out.println("packet.getLength() returns: " + packet.getLength());
        System.out.println("packet.getOffset() returns: " + packet.getOffset());
        System.out.println("packet.getSocketAddress() returns: " + packet.getSocketAddress());
        System.out.println("setting packet port to 12345...");
        packet.setPort(12345);
        System.out.println("sending 'hello'...");
        socket.send(packet);
    }
}
