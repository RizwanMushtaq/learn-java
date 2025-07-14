package com.rizwanmushtaq;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.SocketException;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

public class ClientHandler implements Runnable {
  BufferedReader reader;
  SocketChannel socket;

  public ClientHandler(SocketChannel clientSocket) {
    this.socket = clientSocket;
    try {
      this.reader = new BufferedReader(Channels.newReader(socket, "UTF-8"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void tellEveryone(String message) {
    for (PrintWriter writer : SimpleChatServer.clientWriters) {
      writer.println(message);
      writer.flush();
    }
  }

  @Override
  public void run() {
    String message;
    try {
      while ((message = reader.readLine()) != null) {
        System.out.println("Received message: " + message);
        tellEveryone(message);
      }
    } catch (SocketException e) {
      System.out.println("Client disconnected: " + socket);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
