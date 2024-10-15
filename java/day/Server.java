import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Chat server listening on port 12345");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection from client established");

            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            // Start chatting
            String message;
            while (true) {
                // Check if the client has sent a message
                if (in.ready()) {
                    message = in.readLine();
                    if (message != null) {
                        System.out.println("Client: " + message);
                    } else {
                        break;
                    }
                }

                // Check if the server administrator wants to send a message
                System.out.print("Server: ");
                message = serverInput.readLine();
                if (message != null && !message.trim().isEmpty()) {
                    out.println("Server: " + message);
                } else if (message != null && message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            // Close the client socket
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}