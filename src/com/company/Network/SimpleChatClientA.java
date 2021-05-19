package com.company.Network;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {
    public static void main(String[] args) {
        SimpleChatClientA simpleChatClientA = new SimpleChatClientA();
        simpleChatClientA.guiAdnGo();
    }

    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    public void guiAdnGo() {
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel panel = new JPanel();
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        outgoing = new JTextField(20);
        panel.add(outgoing);
        panel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(500, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUpNetworking();
    }

    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.3", 6666);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Connection is started");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = outgoing.getText();
            System.out.println(message);
            writer.println(message);
            writer.flush();
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }
}
