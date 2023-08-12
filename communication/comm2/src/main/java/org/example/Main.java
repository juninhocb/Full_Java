package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        // Add a small delay before exiting
        Socket socket = new Socket("localhost", 8000);
        OutputStream os = socket.getOutputStream();
        try {
            os.write("Hello server socket ".getBytes());
            os.flush();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            socket.close();
            os.close();
        }

    }
}