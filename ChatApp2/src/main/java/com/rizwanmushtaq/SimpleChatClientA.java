package com.rizwanmushtaq;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleChatClientA {
  private JTextArea incoming;
  private JTextField outgoing;
  private PrintWriter printWriter;
  private BufferedReader bufferedReader;

  public static void main(String[] args) {
    SimpleChatClientA client = new SimpleChatClientA();
    client.go();
  }

  private void go() {
    setupNetworking();
    JScrollPane scroller = createScrollableTextArea();
    outgoing = new JTextField(20);
    JButton sendButton = new JButton("Send");
    sendButton.addActionListener(e -> sendMessage());
    // Adding components to the main panel
    JPanel mainPanel = new JPanel();
    mainPanel.add(scroller);
    mainPanel.add(outgoing);
    mainPanel.add(sendButton);
    // Setting up Thread to read messages from the server
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(new IncomingReader());
    // Setting up the main frame
    JFrame frame = new JFrame("Simple Chat Client A");
    frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private void setupNetworking() {
    try {
      InetSocketAddress serverAddress = new InetSocketAddress("localhost",
          5000);
      SocketChannel socketChannel = SocketChannel.open(serverAddress);
      printWriter = new PrintWriter(Channels.newWriter(socketChannel, "UTF-8"), true);
      bufferedReader = new BufferedReader(Channels.newReader(socketChannel, "UTF-8"));
      System.out.println("Networking established with server at " + serverAddress);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private JScrollPane createScrollableTextArea() {
    incoming = new JTextArea(20, 40);
    incoming.setLineWrap(true);
    incoming.setWrapStyleWord(true);
    incoming.setEditable(false);
    JScrollPane scroller = new JScrollPane(incoming);
    scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    return scroller;
  }

  private void sendMessage() {
    if (printWriter != null) {
      printWriter.println(outgoing.getText());
      printWriter.flush();
      outgoing.setText("");
      outgoing.requestFocus();
    } else {
      System.err.println("PrintWriter is not initialized.");
    }
  }

  public class IncomingReader implements Runnable {
    @Override
    public void run() {
      String message;
      try {
        while ((message = bufferedReader.readLine()) != null) {
          System.out.println("Received: " + message);
          incoming.append(message + "\n");
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

