package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8000); //create bind
        System.out.println("Listening on 8000...");
        while (true){
            Socket socket = ss.accept();
            //block program to listen
            try{
                //listening communication
                InputStream is = socket.getInputStream(); //when communication comes, store those bytes
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Message: " + line);
                }
            }catch (IOException exception){
                System.out.println(exception);
            }finally {
                socket.close(); //unblock connection to the next
            }

        }

    }
}