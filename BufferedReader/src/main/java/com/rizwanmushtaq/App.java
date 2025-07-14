package com.rizwanmushtaq;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class App {
  public static void main(String[] args) throws IOException {
    System.out.println("Buffered Reader App!");
    SocketAddress serverAddress = new InetSocketAddress("127.0.1", 5000);
    SocketChannel socketChannel = SocketChannel.open(serverAddress);
    Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
    BufferedReader bufferedReader = new BufferedReader(reader);
    Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);
    PrintWriter printWriter = new PrintWriter(writer);
    printWriter.println("Hello, Server!");
    printWriter.print("This is a test message.");
    // Read a line from the server
    String message = bufferedReader.readLine();
    System.out.println("Received message: " + message);
  }
}
