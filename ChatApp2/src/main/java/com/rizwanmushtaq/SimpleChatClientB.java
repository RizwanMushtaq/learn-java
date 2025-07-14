package com.rizwanmushtaq;

import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

public class SimpleChatClientB {
  private PrintWriter printWriter;
  private JTextField textField;

  public static void main(String[] args) {
    SimpleChatClientB client = new SimpleChatClientB();
    client.go();
  }

  private void setupNetworking() {
    try {
      InetSocketAddress serverAddress = new InetSocketAddress("localhost",
          5000);
      SocketChannel socketChannel = SocketChannel.open(serverAddress);
      Writer writer = Channels.newWriter(socketChannel, "UTF-8");
      printWriter = new PrintWriter(writer, true);
      System.out.println("Networking established with server at " + serverAddress);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void go() {
    setupNetworking();
    textField = new JTextField(20);
    JButton sendButton = new JButton("Send");
    sendButton.addActionListener(e -> sendMessage());
    JPanel panel = new JPanel();
    panel.add(textField);
    panel.add(sendButton);
    JFrame frame = new JFrame("Simple Chat Client A");
    frame.getContentPane().add(BorderLayout.CENTER, panel);
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private void sendMessage() {
    if (printWriter != null) {
      printWriter.println(textField.getText());
      printWriter.flush();
      textField.setText("");
      textField.requestFocus();
    } else {
      System.err.println("PrintWriter is not initialized.");
    }
  }
}
