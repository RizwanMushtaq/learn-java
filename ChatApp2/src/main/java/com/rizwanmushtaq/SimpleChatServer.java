package com.rizwanmushtaq;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleChatServer {
  public static final List<PrintWriter> clientWriters = new ArrayList<>();

  public static void main(String[] args) {
    SimpleChatServer server = new SimpleChatServer();
    server.startServer();
  }

  private void startServer() {
    ExecutorService threadPool = Executors.newCachedThreadPool();
    try {
      ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
      serverSocketChannel.bind(new InetSocketAddress("localhost", 5000));
      System.out.println("Server started and listening on port 5000...");
      while (serverSocketChannel.isOpen()) {
        SocketChannel clientSocket = serverSocketChannel.accept();
        PrintWriter clientWriter = new PrintWriter(
            Channels.newWriter(clientSocket, "UTF-8"), true);
        clientWriters.add(clientWriter);
        threadPool.submit(new ClientHandler(clientSocket));
        System.out.println("New client connected: " + clientSocket.getRemoteAddress());
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      threadPool.shutdown();
    }
  }
}
