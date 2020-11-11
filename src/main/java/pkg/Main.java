package pkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 99670 on 11.11.2020.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(80);
            Socket socket = serverSocket.accept();
            InetAddress inetAddress =  socket.getInetAddress();
            System.out.println(inetAddress.toString()+" это адрес клиента");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println( bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
