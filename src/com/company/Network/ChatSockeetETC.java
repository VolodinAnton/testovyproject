package com.company.Network;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class ChatSockeetETC {
    private Socket socket;
    private String inputMessage;
    private String outputMessage;

    public void sendMessage() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            InputStreamReader socketStream = new InputStreamReader(socket.getInputStream());
            BufferedReader readerMassages = new BufferedReader(socketStream);
            inputMessage = readerMassages.readLine();
        } catch (UnknownHostException e) {
            System.out.println("UnknownHostException occurred");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }


    }

    public void reciveMessage() {
        try {
            PrintWriter socketOutStream = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }
    public static void main(String[] args) {


    }
}
