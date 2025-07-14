package com.rizwanmushtaq;

import java.io.BufferedReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class DailyAdviceClient {
  public static void main(String[] args) {
    DailyAdviceClient client = new DailyAdviceClient();
    client.go();
  }

  public void go() {
    InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
    try (SocketChannel socketChannel = SocketChannel.open(serverAddress)) {
      Reader channelReader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
      BufferedReader bufferedReader = new BufferedReader(channelReader);
      String advice = bufferedReader.readLine();
      System.out.println("Today's advice: " + advice);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
