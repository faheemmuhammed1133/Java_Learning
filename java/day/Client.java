import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 12345);
            System.out.println("Connected to chat server on port 12345");

            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Start chatting
            String message;
            while (true) {
                System.out.print("You: ");
                message = userInput.readLine();
                if (message != null && !message.trim().isEmpty()) {
                    out.println(message);
                    message = in.readLine();
                    System.out.println("Server: " + message);
                } else {
                    break;
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}