package com.company.Network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    public static void main(String[] args) {
        DailyAdviceServer dailyAdviceServer = new DailyAdviceServer();
        dailyAdviceServer.messageSenderFromServerOneThread();
    }

    private String[] advices = {"Я хороший", "Я добрый", "Я получаю то, что захочу",
            "Я добиваюсь поставленных целей", "Я добиваюсь своего, нужно просто немного времени и все получится"};

    public void messageSenderFromServerOneThread() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while(true) {
                Socket socketToClient = serverSocket.accept();
                PrintWriter streamForSendingMessagesToClient = new PrintWriter(socketToClient.getOutputStream());
                String advice = getAdvice();
                streamForSendingMessagesToClient.println(advice);
                streamForSendingMessagesToClient.close();
                //System.out.println(advice);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        String advice;
        int random = (int) (Math.random() * advices.length);
        advice = advices[random];
        return advice;
    }

}
