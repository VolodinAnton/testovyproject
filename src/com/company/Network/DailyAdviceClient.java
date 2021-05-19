package com.company.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    String adviceFromServer;
    public void receiveMessage() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new Socket("127.0.0.2", 4242).getInputStream()))) {
            adviceFromServer = reader.readLine();
            System.out.println(adviceFromServer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient dailyAdviceClient = new DailyAdviceClient();
        dailyAdviceClient.receiveMessage();
    }
}
