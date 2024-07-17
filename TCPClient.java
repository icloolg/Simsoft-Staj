import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    private Socket socket = null;
    private Scanner input = null;
    private PrintWriter out = null;

    public TCPClient(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            input = new Scanner(System.in);
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (UnknownHostException u) {
            System.out.println(u);
            return;
        } catch (IOException i) {
            System.out.println(i);
            return;
        }

        accessServer();
    }

    private void accessServer() {
        String line = "";

        while (!line.equals("BYE")) {
            try {
                System.out.print("Enter message: ");
                line = input.nextLine();
                out.println(line);
            } catch (Exception i) {
                System.out.println(i);
            }
        }

        // Close resources after "BYE" is sent
        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }

        System.out.println("Connection closed.");
    }

    public static void main(String args[]) {
        TCPClient client = new TCPClient("127.0.0.1", 5001);
    }
}
