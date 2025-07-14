package com.rizwanmushtaq;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Random;

public class DailyAdviceServer {
  final private String[] adviceList = {
      "Take it easy!",
      "Stay positive!",
      "Keep pushing forward!",
      "Believe in yourself!",
      "Embrace the journey!"
  };
  private final Random random = new Random();

  public static void main(String[] args) {
    DailyAdviceServer server = new DailyAdviceServer();
    server.go();
  }

  public void go() {
    try {
      // Create a server socket channel
      ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
      serverSocketChannel.bind(new InetSocketAddress("127.0.0.1", 5000));
      System.out.println("Server is listening on port 5000...");
      while (serverSocketChannel.isOpen()) {
        // Accept a connection
        SocketChannel clientChannel = serverSocketChannel.accept();
        System.out.println("Client connected!");
        // Create a writer to send advice to the client
        PrintWriter writer =
            new PrintWriter(Channels.newOutputStream(clientChannel));
        String advice = getAdvice();
        writer.println(advice);
        writer.flush();
        writer.close();
        System.out.println("Advice sent to client: " + advice);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private String getAdvice() {
    int nextAdvice = random.nextInt(adviceList.length);
    return adviceList[nextAdvice];
  }
}
